import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.*;
import java.util.*;


public class CustomParser{
  ArrayList<LayerInfo> layers;
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
    //ProgSentenceContext ProgSentenceContext = parser.ProgSentence();

    ParseTreeWalker walker = new ParseTreeWalker();
    AntlrProgListener listener = new AntlrProgListener();
    walker.walk(listener, tree);
    ArrayList<LayerInfo> layers = listener.giveLayers();
    System.out.println(layers.size());

    for(LayerInfo layer : layers){
      if(layer.type.equals("Concat")){
        concatPrinter(layers, layer);
      }
    }
  }

  public static void concatPrinter(ArrayList<LayerInfo> layers, LayerInfo layerToPrint){
    String returnString = "";
    returnString += "endpoint = '" + layerToPrint.name + "'" + "\n";
    returnString += "with tf.variable_scope(end_point):\n";
    for(int i = 0; i < layerToPrint.bottom.size(); i++){
      String currentBottomLayerName = layerToPrint.bottom.get(i);
      returnString += "with tf.variable_scope('Branch_" + i + "'):\n";
      LayerInfo currentBottomLayer = findLayer(layers, currentBottomLayerName);
      LayerInfo secondCurrenBottomLayer = findLayer(layers, currentBottomLayer.bottom.get(0));

      if(secondCurrenBottomLayer.type.equals("Convolution")){
        returnString += "branch_" + i + " = slim.conv2d(net, " + secondCurrenBottomLayer.convolutionparaminfo.num_output + ", ["+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size + ", "+ secondCurrenBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + secondCurrenBottomLayer.name + "')\n";
        //System.out.println(secondCurrenBottomLayer.type);
      }
      if(secondCurrenBottomLayer.type.equals("Pooling")){
        returnString += "branch_" + i + " = slim.max_pool2d(net, " + " ["+ secondCurrenBottomLayer.poolingparaminfo.kernel_size + ", "+ secondCurrenBottomLayer.poolingparaminfo.kernel_size +"], scope='" + secondCurrenBottomLayer.name + "')\n";
      }

      if(currentBottomLayer.type.equals("Convolution")){
        if(i != 0){
          returnString += "branch_" + i + " = slim.conv2d(branch_" + i + ", " + currentBottomLayer.convolutionparaminfo.num_output + ", ["+ currentBottomLayer.convolutionparaminfo.kernel_size + ", "+ currentBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + currentBottomLayer.name + "')\n";
        }else{
          returnString += "branch_" + i + " = slim.conv2d(net, " + currentBottomLayer.convolutionparaminfo.num_output + ", ["+ currentBottomLayer.convolutionparaminfo.kernel_size + ", "+ currentBottomLayer.convolutionparaminfo.kernel_size +"], scope='" + currentBottomLayer.name + "')\n";

        }
      }

    }
    returnString += "net = tf.concat(axis=3, values=[branch_0, branch_1, branch_2, branch_3])\nend_points[end_point] = net\n";



    System.out.println(returnString);
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
