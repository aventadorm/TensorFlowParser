import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.*;
import java.util.*;


public class CustomParser{
  ArrayList<LayerInfo> layers;
  ArrayList<LayerInfo> layersToRemove;
  public static void main(String[] args){
    String text;
    text = readFileAsString("test2.prototxt");
    printProg(text);
  }
  private static void printProg(String ProgSentence){
    ProgLexer lexer = new ProgLexer(new ANTLRInputStream(ProgSentence));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ProgParser parser = new ProgParser(tokens);
    ParseTree tree = parser.prog();
    String mainString = "";
    String multiplexMainString = "";
    String independentString = "";
    String multiplexIndependentString = "";
    String convoString = "";
    String dropoutString = "";
    String softmaxString = "";
    ParseTreeWalker walker = new ParseTreeWalker();
    AntlrProgListener listener = new AntlrProgListener();
    walker.walk(listener, tree);
    ArrayList<LayerInfo> layers = listener.giveLayers();
    ArrayList<LayerInfo> layersToRemove = new ArrayList<LayerInfo>();
    ProgInfo proginfo = listener.giveproginfo();
    //**************************************************************
    //Check if convolution layers have bn-scale-relu
    HashMap<String, Integer> map = new HashMap<>();
    for(LayerInfo layer : layers){
      if(layer.type.equals("BatchNorm") || layer.type.equals("Scale") || layer.type.equals("ReLU")){
        if(map.get(layer.bottom.get(0)) == null){
          map.put(layer.bottom.get(0), new Integer(0));
        }
        map.put(layer.bottom.get(0), map.get(layer.bottom.get(0)) + 1);
      }
    }
    for(String key : map.keySet()){
      if(map.get(key) != 3){
        int i = 3 - map.get(key);
        System.err.println(key + " does not have " + i + " of the 3 layers BatchNorm, Scale and RelU.\nQuitting.\n");
        System.exit(0);
      }
    }
    //Check if convolution layers have bn-scale-relu
    //**************************************************************
    //Generate first degree layers to avoid
    //These are directly under concat bottoms
    ArrayList<String> bottomString = new ArrayList<String>();
    bottomString.add(proginfo.input);
    Boolean notDone = true;
    Boolean isInConcat;
    ArrayList<LayerInfo> layersToAvoid = new ArrayList<LayerInfo>();
    while(notDone){
      for(LayerInfo layer : layers){
        if(layer.bottom.get(0).equals(bottomString.get(0)) && ((layer.type.equals("Convolution")) || (layer.type.equals("Pooling")) || (layer.type.equals("Concat")) || (layer.type.equals("Dropout")))){
          bottomString.add(layer.name);
          if(layer.type.equals("Dropout")){
            notDone = false;
          }
          isInConcat = false;
          for(LayerInfo concatLayer : layers){
            if(concatLayer.type.equals("Concat")){
              for(String bottoms : concatLayer.bottom){
                if(bottoms.equals(layer.name)){
                  layersToAvoid.add(layer);
                }
              }
            }
          }
        }

      }
      bottomString.remove(0);
      if(bottomString.get(0).equals("Dropout")){
        notDone = false;
      }
    }
    //Generate first degree layers to avoid
    //These are directly under concat bottoms
    //**************************************************************
    //Generate second degree layers to avoid
    //These are directly under first degree layer bottoms
    ArrayList<LayerInfo> secondaryLayersToAvoid = new ArrayList<LayerInfo>();
    for(LayerInfo layer : layers){
      if(layer.type.equals("Convolution") || layer.type.equals("Pooling")){
        for(LayerInfo secondLayer : layersToAvoid){
          if(secondLayer.bottom.get(0).equals(layer.name)){
            Boolean isFirst = false;
            for(LayerInfo firstConcatLayer : layers){
              if(firstConcatLayer.type.equals("Concat")){
                if(firstConcatLayer.bottom.get(0).equals(secondLayer.name)){
                  isFirst = true;
                }
              }
            }
            if(!isFirst){
              secondaryLayersToAvoid.add(layer);
            }

          }
        }
      }
    }
    //Generate second degree layers to avoid
    //These are directly under first degree layer bottoms
    //**************************************************************
    //Actual printing of layers in order
    //Checks that they dont belong to the two avoiding arrays and prints
    //them by parsing bottom arrays beginning from program input
    bottomString = new ArrayList<String>();
    bottomString.add(proginfo.input);
    notDone = true;

    while(notDone){

      for(LayerInfo layer : layers){
        if
        (
          layer.bottom.get(0).equals(bottomString.get(0))
        &&
        (
          layer.type.equals("Convolution")
          ||
          layer.type.equals("Pooling")
          ||
          layer.type.equals("Concat")
          ||
          layer.type.equals("Dropout")
        )
        ){
      if
      (
        !layersToAvoid.contains(layer)
        &&
        !secondaryLayersToAvoid.contains(layer)
      )
      {
        System.out.println(layer.name);
        if(layer.type.equals("Dropout")){
          notDone = false;
        }
        if((layer.type.equals("Convolution") || layer.type.equals("Pooling")) && !layer.bottom.get(0).equals("logits")){

          independentString += convoPrinter(layers, layer, layersToRemove, proginfo);
          multiplexIndependentString += convoPrinter(layers, layer, layersToRemove, proginfo);
        }
        if(layer.type.equals("Concat")){
          independentString += concatPrinter(layers, layer, layersToRemove);
          multiplexIndependentString += multiplexConcatPrinter(layers, layer, layersToRemove);
        }
        if(layer.type.equals("Dropout")){
          independentString += dropoutPrinter(layers, layer, layersToRemove);
          multiplexIndependentString += dropoutPrinter(layers, layer, layersToRemove);
        }

      }
        bottomString.add(layer.name);
      }
    }
      bottomString.remove(0);
    }
    //Actual printing of layers in order
    //Checks that they dont belong to the two avoiding arrays and prints
    //them by parsing bottom arrays beginning from program input
    //**************************************************************
    //Prints the last softmax layer
    for(LayerInfo layer : layers){
      if(layer.type.equals("Softmax")){
        independentString += softmaxPrinter(layers, layer, layersToRemove);
        multiplexIndependentString += softmaxPrinter(layers, layer, layersToRemove);
      }
    }
    //Actual printing of layers in order
    //**************************************************************
    //Generation of other metadata like leading and succeeding text
    String defaultimagesize = proginfo.inputshape.dims.get(proginfo.inputshape.dims.size()-1);
    defaultimagesize = proginfo.name + "." + "default_image_size = " + defaultimagesize + "\n\n";

    String lastText;
    lastText = readFileAsString("afterTemplate.txt");
    String firstText;
    firstText = readFileAsString("beforeTemplate.txt") + "\n\n";
    String secondText = "def " + proginfo.name + "(" + proginfo.input + ", num_classes=1000, is_training=True, reuse=None, scope='" + proginfo.name + "'):\n\n";
    secondText += "with tf.variable_scope(scope, \"Model\", reuse=reuse):\n";
    secondText += "with slim.arg_scope(default_arg_scope(is_training)):\n";
    secondText += "end_points = {}\n\n";
    String multiplexSecondText = "def " + proginfo.name + "(" + proginfo.input + ", num_classes=1000, is_training=True, reuse=None, scope='" + proginfo.name + "', config=None):\n\n";
    multiplexSecondText += "selectdepth = lambda k,v: int(config[k]['ratio']*v) if config and k in config and 'ratio' in config[k] else v\n\n";
    multiplexSecondText += "selectinput = lambda k, v: config[k]['input'] if config and k in config and 'input' in config[k] else v\n\n";
    multiplexSecondText += "with tf.variable_scope(scope, \"Model\", reuse=reuse):\n";
    multiplexSecondText += "with slim.arg_scope(default_arg_scope(is_training)):\n";
    multiplexSecondText += "end_points = {}\n\n";
    //Generation of other metadata like leading and succeeding text
    //**************************************************************
    //Actual writing of the strings to files
    //ordered_generated_simple.py has the simple coded
    //ordered_generated_multiplexing.py has the multiplexing code
    try {
			File file = new File("ordered_generated_simple.py");
      File multiplexFile = new File("ordered_generated_multiplexing.py");
			FileWriter fileWriter = new FileWriter(file);
      FileWriter multiplexFileWriter = new FileWriter(multiplexFile);
			fileWriter.write(firstText);
      fileWriter.write(secondText);
      fileWriter.write(independentString);
      fileWriter.write(defaultimagesize);
      fileWriter.write(lastText);
			fileWriter.flush();
			fileWriter.close();
      multiplexFileWriter.write(firstText);
      multiplexFileWriter.write(secondText);
      multiplexFileWriter.write(multiplexIndependentString);
      multiplexFileWriter.write(defaultimagesize);
      multiplexFileWriter.write(lastText);
			multiplexFileWriter.flush();
			multiplexFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    //**************************************************************
    //Actual writing of the strings to files
    //ordered_generated_simple.py has the simple coded
    //ordered_generated_multiplexing.py has the multiplexing code
    //**************************************************************
  }
  public static String softmaxPrinter(ArrayList<LayerInfo> layers, LayerInfo layerToPrint, ArrayList<LayerInfo> layersToRemove){
    String returnString = "";
    returnString += "end_points['" + layerToPrint.name + "'] = slim.softmax(logits, scope='" + layerToPrint.name + "')\n";
    returnString += "return logits, end_points\n\n";
    return returnString;
    //System.out.println(returnString);
  }
  public static String dropoutPrinter(ArrayList<LayerInfo> layers, LayerInfo layerToPrint, ArrayList<LayerInfo> layersToRemove){
    String returnString = "";
    returnString += "endpoint = 'Logits'\n";
    returnString += "with tf.variable_scope(end_point):\n";
    float actualdropoutratio = 1 - Float.parseFloat(layerToPrint.dropoutparaminfo.dropout_ratio);
    returnString += "net = slim.dropout(net, " + actualdropoutratio + ", scope='" + layerToPrint.name + "')\n";
    returnString += "logits = slim.conv2d(net, num_classes, [1, 1], activation_fn=None, normalizer_fn=None, scope='Conv2d_0c_1x1')\n\n";
    returnString += "logits = tf.squeeze(logits, [1, 2], name='SpatialSqueeze')\n";
    returnString += "end_points[end_point] = logits\n\n";
    return returnString;
    //System.out.println(returnString);

  }
  public static String convoPrinter(ArrayList<LayerInfo> layers, LayerInfo layerToPrint, ArrayList<LayerInfo> layersToRemove, ProgInfo proginfo){
    String returnString = "";
    returnString += "endpoint = '" + layerToPrint.name + "'\n";
    if(layerToPrint.type.equals("Convolution")){
      if(layerToPrint.bottom.get(0).equals(proginfo.input)){
        returnString += "net = slim.conv2d("+ proginfo.input +", " + layerToPrint.convolutionparaminfo.num_output + ", [" + layerToPrint.convolutionparaminfo.kernel_size + "," + layerToPrint.convolutionparaminfo.kernel_size + "], stride=" + layerToPrint.convolutionparaminfo.stride + " scope=end_point)\n";
        returnString += "end_points[end_point] = net\n\n";
      }else{
        returnString += "net = slim.conv2d(net, " + layerToPrint.convolutionparaminfo.num_output + ", [" + layerToPrint.convolutionparaminfo.kernel_size + "," + layerToPrint.convolutionparaminfo.kernel_size + "], stride=" + layerToPrint.convolutionparaminfo.stride + " scope=end_point)\n";
        returnString += "end_points[end_point] = net\n\n";
      }

    }
    if(layerToPrint.type.equals("Pooling")){
      returnString += "net = slim.max_pool2d(net, [" + layerToPrint.poolingparaminfo.kernel_size + "," + layerToPrint.poolingparaminfo.kernel_size + "], stride=" + layerToPrint.poolingparaminfo.stride + " scope=end_point)\n";
      returnString += "end_points[end_point] = net\n\n";
    }
    return returnString;
    //System.out.println(returnString);

  }
  public static String concatPrinter(ArrayList<LayerInfo> layers, LayerInfo layerToPrint, ArrayList<LayerInfo> layersToRemove){
    String returnString = "";
    returnString += "endpoint = '" + layerToPrint.name + "'" + "\n";
    returnString += "with tf.variable_scope(end_point):\n";
    for(int i = 0; i < layerToPrint.bottom.size(); i++){
      String currentBottomLayerName = layerToPrint.bottom.get(i);
      returnString += "with tf.variable_scope('Branch_" + i + "'):\n";
      LayerInfo currentBottomLayer = findLayer(layers, currentBottomLayerName);
      LayerInfo secondCurrenBottomLayer = findLayer(layers, currentBottomLayer.bottom.get(0));

      if(secondCurrenBottomLayer.type.equals("Convolution")){
        if(i != 0){
          returnString += "branch_" + i + " = slim.conv2d(net, " + secondCurrenBottomLayer.convolutionparaminfo.num_output + ", ["+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size + ", "+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + secondCurrenBottomLayer.name + "')\n";
          layersToRemove.add(secondCurrenBottomLayer);
        }
      }
      if(secondCurrenBottomLayer.type.equals("Pooling")){
        if(i != 0){
          returnString += "branch_" + i + " = slim.max_pool2d(net, " + " ["+ secondCurrenBottomLayer.poolingparaminfo.kernel_size + ", "+ secondCurrenBottomLayer.poolingparaminfo.kernel_size +"], scope='" + secondCurrenBottomLayer.name + "')\n";
          layersToRemove.add(secondCurrenBottomLayer);
        }
      }

      if(currentBottomLayer.type.equals("Convolution")){
        if(i != 0){
          returnString += "branch_" + i + " = slim.conv2d(branch_" + i + ", " + currentBottomLayer.convolutionparaminfo.num_output + ", ["+ currentBottomLayer.convolutionparaminfo.kernel_size + ", "+ currentBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + currentBottomLayer.name + "')\n";
          layersToRemove.add(currentBottomLayer);
        }else{
          returnString += "branch_" + i + " = slim.conv2d(net, " + currentBottomLayer.convolutionparaminfo.num_output + ", ["+ currentBottomLayer.convolutionparaminfo.kernel_size + ", "+ currentBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + currentBottomLayer.name + "')\n";
          layersToRemove.add(currentBottomLayer);
        }
      }

    }
    returnString += "net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])\nend_points[end_point] = net\n\n\n";
    layersToRemove.add(layerToPrint);

    return returnString;
    //System.out.println(returnString);
  }
  public static String multiplexConcatPrinter(ArrayList<LayerInfo> layers, LayerInfo layerToPrint, ArrayList<LayerInfo> layersToRemove){
    String returnString = "";
    returnString += "endpoint = '" + layerToPrint.name + "'" + "\n";
    returnString += "net = selectinput(end_point, net)";
    returnString += "with tf.variable_scope(end_point):\n";
    for(int i = 0; i < layerToPrint.bottom.size(); i++){
      String currentBottomLayerName = layerToPrint.bottom.get(i);
      returnString += "with tf.variable_scope('Branch_" + i + "'):\n";
      LayerInfo currentBottomLayer = findLayer(layers, currentBottomLayerName);
      LayerInfo secondCurrenBottomLayer = findLayer(layers, currentBottomLayer.bottom.get(0));

      if(secondCurrenBottomLayer.type.equals("Convolution")){
        if(i != 0){
          returnString += "branch_" + i + " = slim.conv2d(net, selectdepth(end_point," + secondCurrenBottomLayer.convolutionparaminfo.num_output + ", ["+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size + ", "+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + secondCurrenBottomLayer.name + "')\n";
          //returnString += "branch_" + i + " = slim.conv2d(net, " + secondCurrenBottomLayer.convolutionparaminfo.num_output + ", ["+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size + ", "+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + secondCurrenBottomLayer.name + "')\n";
          layersToRemove.add(secondCurrenBottomLayer);
        }
      }
      if(secondCurrenBottomLayer.type.equals("Pooling")){
        if(i != 0){
          returnString += "branch_" + i + " = slim.max_pool2d(net, " + " ["+ secondCurrenBottomLayer.poolingparaminfo.kernel_size + ", "+ secondCurrenBottomLayer.poolingparaminfo.kernel_size +"], scope='" + secondCurrenBottomLayer.name + "')\n";
          layersToRemove.add(secondCurrenBottomLayer);
        }
      }

      if(currentBottomLayer.type.equals("Convolution")){
        if(i != 0){
          returnString += "branch_" + i + " = slim.conv2d(branch_" + i + ", " + currentBottomLayer.convolutionparaminfo.num_output + ", ["+ currentBottomLayer.convolutionparaminfo.kernel_size + ", "+ currentBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + currentBottomLayer.name + "')\n";
          layersToRemove.add(currentBottomLayer);
        }else{
          returnString += "branch_" + i + " = slim.conv2d(net, " + currentBottomLayer.convolutionparaminfo.num_output + ", ["+ currentBottomLayer.convolutionparaminfo.kernel_size + ", "+ currentBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + currentBottomLayer.name + "')\n";
          layersToRemove.add(currentBottomLayer);
        }
      }

    }
    returnString += "net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])\nend_points[end_point] = net\n\n\n";
    layersToRemove.add(layerToPrint);

    return returnString;
    //System.out.println(returnString);
  }
  public static LayerInfo findLayer(ArrayList<LayerInfo> layers, String name){
    for(LayerInfo layer : layers){
      if(layer.name.equals(name)){
        return layer;
      }

    }
    return null;
  }
  public static String readFileAsString(String fileName){
    String text = "";
    try {
      text = new String(Files.readAllBytes(Paths.get(fileName)));
    }
    catch (IOException e){
      e.printStackTrace();
    }
    return text;
  }
}
