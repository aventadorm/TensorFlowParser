import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class CustomParser{
  public static void main(String[] args){
    String text;
    text = readFileAsString("input.prototxt");
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
