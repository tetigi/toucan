package frontend.tokeniser;

import java_cup.runtime.Symbol;
import utils.UnorderedTree;
import backend.interpreter.Interpreter;
import frontend.parser.ParserCup;

public class Test {

    // TODO Implement logging
    // TODO Implement enum for types

    /**
     * @param args
     */
    public static void main(final String[] args) {
	final String myString = "2 * 2 + 3";
	final Interpreter interpreter = new Interpreter();
	final ParserCup parser = new ParserCup(new Tokeniser(
		new java.io.StringReader(myString)));
	System.out.println("Parsing...");
	try {
	    final Symbol s = parser.parse();

	    @SuppressWarnings("unchecked")
	    final UnorderedTree<Token> n = (UnorderedTree<Token>) s.value;
	    n.printTree();

	    System.out.println("The result of " + myString + " is ");
	    System.out.println(interpreter.evaluate(n));
	} catch (final Exception e) {
	    e.printStackTrace();
	}
    }
}
