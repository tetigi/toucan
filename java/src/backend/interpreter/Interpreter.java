package backend.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.Tree;
import utils.Tree.TreeNodeTFunc;
import utils.UnorderedTree;
import backend.interpreter.data.Context;
import backend.interpreter.data.DataHString;
import backend.interpreter.data.DataType;
import backend.interpreter.data.TypeFactory;
import backend.interpreter.typeclass.ShowClass;
import backend.interpreter.typeclass.TypeClass;
import frontend.tokeniser.Token;

public class Interpreter {

    Context c;

    public Interpreter() {
	c = new Context();
	c.init();
    }

    /**
     * Evaluate an abstract data tree.
     * 
     * @param tree
     *            The tree to evaluate
     * @return The string output. Temporary.
     */
    public String evaluate(final Tree<Token> tree) {
	// TODO Type check the tree and convert to expressible values.
	DataType t = tree.depthFirstTransform(new TokenTypeTransformer(c))
		.getValue();
	// TODO Collapse the tree to the final statement
	if (t.getInstance().isInstanceOf(TypeClass.Show)) {
	    return ((DataHString) t.getInstance().runMethod(ShowClass.SHOW,
		    Arrays.asList(t))).getData();
	}
	return "Could not show " + t.toString();
    }

    class TokenTypeTransformer implements TreeNodeTFunc<Token, DataType> {

	Context c;

	public TokenTypeTransformer(Context c) {
	    this.c = c;
	}

	@Override
	public Tree<DataType> transformTree(Tree<Token> elem) {
	    Tree<DataType> ret = new UnorderedTree<DataType>();
	    if (elem.isLeaf()) { // Terminal node
		ret.setValue(TypeFactory.getTypeFromToken(elem.getValue()));
	    } else { // Non-terminal node - op etc.
		List<Tree<Token>> children = elem.getChildren();
		List<Tree<DataType>> typedChildren = new ArrayList<Tree<DataType>>();
		ret.addChildren(typedChildren);
		for (Tree<Token> child : children) {
		    typedChildren.add(transformTree(child));
		}

		List<DataType> vals = new ArrayList<DataType>();
		for (Tree<DataType> child : typedChildren) {
		    vals.add(child.getValue());
		}

		ret.setValue(FunctionFactory.runFunctionFromToken(c,
			elem.getValue(), vals));
	    }
	    return ret;
	}

    }

}
