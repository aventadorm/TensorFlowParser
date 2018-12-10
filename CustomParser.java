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
    text = readFileAsString("inception_v1.prototxt");
    printProg(text);
  }
  private static void printProg(String ProgSentence){
    ProgLexer lexer = new ProgLexer(new ANTLRInputStream(ProgSentence));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ProgParser parser = new ProgParser(tokens);
    ParseTree tree = parser.prog();
    String printString = "";
    String multiplexPrintString = "";
    String concatString = "";
    String multiplexConcatString = "";
    String convoString = "";
    String dropoutString = "";
    String softmaxString = "";

    //ProgSentenceContext ProgSentenceContext = parser.ProgSentence();

    ParseTreeWalker walker = new ParseTreeWalker();
    AntlrProgListener listener = new AntlrProgListener();
    walker.walk(listener, tree);
    ArrayList<LayerInfo> layers = listener.giveLayers();
    ArrayList<LayerInfo> layersToRemove = new ArrayList<LayerInfo>();
    //System.out.println(layers.size());

    for(LayerInfo layer : layers){
      if(layer.type.equals("Concat")){
        concatString += concatPrinter(layers, layer, layersToRemove);
        multiplexConcatString += multiplexConcatPrinter(layers, layer, layersToRemove);
      }
    }
    for(LayerInfo layer : layers){
      if(((layer.type.equals("Convolution")) || (layer.type.equals("Pooling"))) && !layersToRemove.contains(layer)){
        convoString += convoPrinter(layers, layer, layersToRemove);
      }
    }
    for(LayerInfo layer : layers){
      if(layer.type.equals("Dropout")){
        dropoutString += dropoutPrinter(layers, layer, layersToRemove);
      }
    }
    for(LayerInfo layer : layers){
      if(layer.type.equals("Softmax")){
        softmaxString += softmaxPrinter(layers, layer, layersToRemove);
      }
    }
    ProgInfo proginfo = listener.giveproginfo();
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

    printString += firstText;
    printString += secondText;
    printString += convoString;
    printString += concatString;
    printString += dropoutString;
    printString += softmaxString;
    printString += defaultimagesize;
    printString += lastText;

    multiplexPrintString += firstText;
    multiplexPrintString += multiplexSecondText;
    multiplexPrintString += convoString;
    multiplexPrintString += multiplexConcatString;
    multiplexPrintString += dropoutString;
    multiplexPrintString += softmaxString;
    multiplexPrintString += defaultimagesize;
    multiplexPrintString += lastText;

    //System.out.println(printString);
    try {
			File file = new File("generated_simple.py");
      File multiplexFile = new File("generated_multiplexing.py");
			FileWriter fileWriter = new FileWriter(file);
      FileWriter multiplexFileWriter = new FileWriter(multiplexFile);
			fileWriter.write(printString);
			fileWriter.flush();
			fileWriter.close();
      multiplexFileWriter.write(multiplexPrintString);
			multiplexFileWriter.flush();
			multiplexFileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


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
  public static String convoPrinter(ArrayList<LayerInfo> layers, LayerInfo layerToPrint, ArrayList<LayerInfo> layersToRemove){
    String returnString = "";
    returnString += "endpoint = '" + layerToPrint.name + "'\n";
    if(layerToPrint.type.equals("Convolution")){
      returnString += "net = slim.conv2d(net, " + layerToPrint.convolutionparaminfo.num_output + ", [" + layerToPrint.convolutionparaminfo.kernel_size + "," + layerToPrint.convolutionparaminfo.kernel_size + "], stride=" + layerToPrint.convolutionparaminfo.stride + " scope=end_point)\n";
      returnString += "end_points[end_point] = net\n\n";
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
