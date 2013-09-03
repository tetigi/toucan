package frontend.tokeniser;

import java_cup.runtime.Symbol;
import backend.interpreter.Interpreter;
import frontend.parser.Node;
import frontend.parser.ParserCup;

public class Test {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    final String myString = "1 + 2 * 3";
    final Interpreter interpreter = new Interpreter();
    final ParserCup parser = new ParserCup(new Tokeniser(
        new java.io.StringReader(myString)));
    System.out.println("Parsing...");
    try {
      final Symbol s = parser.parse();
      final Node n = (Node) s.value;
      n.sayTree();
      System.out.println(interpreter.evaluate(n));
    } catch (final Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
