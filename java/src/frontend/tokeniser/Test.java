package frontend.tokeniser;

import java.util.logging.Logger;

import java_cup.runtime.Symbol;
import utils.UnorderedTree;
import backend.interpreter.Interpreter;
import frontend.parser.ParserCup;

public class Test {

    private static Logger LOGGER = Logger.getLogger(Test.class.getName());

    /**
     * @param args
     */
    public static void main(final String[] args) {
	//final String myString = "4 * 3 + negate 2";
	final String myString = "abs (3 - 1000)";
	final Interpreter interpreter = new Interpreter();
	final Tokeniser tokeniser = new Tokeniser(new java.io.StringReader(myString));
	final ParserCup parser = new ParserCup(new Tokeniser(
		new java.io.StringReader(myString)));

	LOGGER.info("Parsing " + myString);

	try {
	    //final Symbol s = parser.parse();
	    final Symbol s = parser.debug_parse();
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
