package frontend.parser;

import frontend.tokeniser.Token;

/**
 * Node class for abstract syntax tree. A node is either a childless, ie. a
 * leaf, or has two children. May change at a later date.
 * 
 * @author tetigi
 * 
 */
public class Node {
  public Node left;
  public Node right;
  public Token token;
  public final boolean hasChildren;

  /**
   * Constructor for making a leaf node.
   * 
   * @param t
   *          Leaf token
   */
  public Node(final Token t) {
    this.token = t;
    hasChildren = false;
  }

  /**
   * Constructor for making a normal node. Has two children nodes that
   * correspond to each argument. Will have to change. TODO Change to nary.
   * 
   * @param t
   *          Token representing the node
   * @param l
   *          Left child
   * @param r
   *          Right child
   */
  public Node(final Token t, final Node l, final Node r) {
    this.left = l;
    this.right = r;
    this.token = t;
    this.hasChildren = true;
  }

  /**
   * Iterates depthwise through the tree, printing each token as it is seen.
   */
  public void sayTree() {
    if (hasChildren) {
      System.out.println(token);
      left.sayTree();
      right.sayTree();
    } else {
      System.out.println(token);
    }
  }

}
