package backend.interpreter;

import utils.Tree;
import utils.Tree.TreeNodeTFunc;
import utils.Tree.TreeTFunc;
import utils.UnorderedTree;
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

	@Override
	public Tree<TypeValue> transformTree(Tree<Token> elem) {
		Tree<TypeValue> ret = new UnorderedTree<TypeValue>();
		if (elem.isLeaf()) { // Terminal node
			ret.setValue(TypeFactory.getTypeFromToken(elem.getValue()));
		} else { // Non-terminal node - op etc.
			
		}
		return ret;
	}
	  
  }

}
