package backend.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import utils.Tree;
import utils.Tree.TreeNodeTFunc;
import utils.UnorderedTree;
import backend.interpreter.data.Context;
import backend.interpreter.data.DataHString;
import backend.interpreter.data.DataType;
import backend.interpreter.exceptions.ClassNotImplementedError;
import backend.interpreter.exceptions.IncorrectArgLengthError;
import backend.interpreter.exceptions.IncorrectTypeError;
import backend.interpreter.exceptions.NoSuchMethodForClassError;
import backend.interpreter.exceptions.NoSuchMethodForTokenError;
import backend.interpreter.exceptions.TokenTypeNotFoundException;
import backend.interpreter.typeclass.ShowClass;
import backend.interpreter.typeclass.TypeClass;
import frontend.tokeniser.Token;

/**
 * Basic Haskell interpreter, taking a tokenised and parsed input tree and
 * evaluating it.
 * 
 * @author tetigi
 * 
 */
public class Interpreter {

    private static Logger LOGGER = Logger
	    .getLogger(Interpreter.class.getName());

    Context c;

    public Interpreter() {
	c = new Context();
	c.init();
    }

    /**
     * Evaluate an abstract data tree of tokens.
     * 
     * @param tree
     *            The tree to evaluate
     * @return The string output. Temporary.
     */
    public String evaluate(final Tree<Token> tree) {

	DataType t = tree.depthFirstTransform(new TokenTypeTransformer(c))
		.getValue();

	if (t.getInstance().isInstanceOf(TypeClass.Show)) {
	    return ((DataHString) t.getInstance().runMethod(ShowClass.SHOW,
		    Arrays.asList(t))).getData();
	}

	LOGGER.info("Could not show final value " + t.getType()
		+ ". Does it extend Show?");
	return "Could not show " + t.toString();
    }

    /**
     * Transforms tokens into an evaluated, typed tree.
     * 
     * @author tetigi
     * 
     */
    class TokenTypeTransformer implements TreeNodeTFunc<Token, DataType> {

	Context c;

	public TokenTypeTransformer(Context c) {
	    this.c = c;
	}

	@Override
	public Tree<DataType> transformTree(Tree<Token> elem) {

	    Tree<DataType> ret = new UnorderedTree<DataType>();

	    if (elem.isLeaf()) { // Terminal node

		try {
		    ret.setValue(TypeFactory.getTypeFromToken(elem.getValue()));
		} catch (TokenTypeNotFoundException e) {
		    LOGGER.severe("Could not get type from token "
			    + elem.getValue());
		    e.printStackTrace();

		    // Exit
		    System.exit(1);
		}

	    } else { // Non-terminal node - op etc.

		List<Tree<Token>> children = elem.getChildren();
		List<Tree<DataType>> typedChildren = new ArrayList<Tree<DataType>>();

		// Type and execute recursively down the tree
		for (Tree<Token> child : children) {
		    typedChildren.add(transformTree(child));
		}

		ret.addChildren(typedChildren);

		// Extract values from children
		List<DataType> vals = new ArrayList<DataType>();
		for (Tree<DataType> child : typedChildren) {
		    vals.add(child.getValue());
		}

		// Run function at current node
		try {
		    ret.setValue(FunctionFactory.runFunctionFromToken(c,
			    elem.getValue(), vals));
		} catch (NoSuchMethodForTokenError | NoSuchMethodForClassError
			| ClassNotImplementedError | IncorrectArgLengthError
			| IncorrectTypeError e) {
		    LOGGER.severe("Could not run function from token "
			    + elem.getValue());
		    e.printStackTrace();

		    // Exit
		    System.exit(1);
		}
	    }
	    return ret;
	}

    }

}
