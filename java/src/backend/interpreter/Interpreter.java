package backend.interpreter;

import java.util.ArrayList;
import java.util.List;

import utils.Tree;
import utils.Tree.TreeNodeTFunc;
import utils.Tree.TreeTFunc;
import utils.UnorderedTree;
import backend.interpreter.data.TypeFactory;
import backend.interpreter.data.TypeValue;
import frontend.tokeniser.Token;

public class Interpreter {

  /**
   * Evaluate an abstract data tree.
   * 
   * @param tree
   *          The tree to evaluate
   * @return The string output. Temporary.
   */
  public String evaluate(final Tree<Token> tree) {
	  // TODO Type check the tree and convert to expressible values.
	  
	  // TODO Collapse the tree to the final statement
    return "HAHA";
  }
  
  class TokenTypeTransformer implements TreeNodeTFunc<Token, TypeValue> {

	public Tree<TypeValue> transformTree(Tree<Token> elem) {
		Tree<TypeValue> ret = new UnorderedTree<TypeValue>();
		if (elem.isLeaf()) { // Terminal node
			ret.setValue(TypeFactory.getTypeFromToken(elem.getValue()));
		} else { // Non-terminal node - op etc.
			List<Tree<Token>> children = elem.getChildren();
			List<Tree<TypeValue>> typedChildren = new ArrayList<Tree<TypeValue>>();
			ret.addChildren(typedChildren);
			for (Tree<Token> child : children) {
				typedChildren.add(transformTree(child));
			}
			
			List<TypeValue> vals = new ArrayList<TypeValue>();
			for (Tree<TypeValue> child : typedChildren) {
				vals.add(child.getValue());
			}
			
			ret.setValue(FunctionFactory.getFunctionFromToken(elem.getValue()).execute(vals));
		}
		return ret;
	}
	  
  }

}
