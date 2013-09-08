package utils;

import java.util.ArrayList;

public class UnorderedTree<T> implements Tree<T> {

  private final ArrayList<UnorderedTree<T>> children = new ArrayList<UnorderedTree<T>>();
  private T value;

  public UnorderedTree(final T val) {
    value = val;
  }

  public UnorderedTree() {
    value = null;
  }

  @Override
  public void map(final utils.Tree.TreeFunc<T> f) {
    for (final UnorderedTree<T> t : children) {
      t.value = f.mapFunction(t.value);
      t.map(f);
    }
  }

  @Override
  public Tree<T> getChild(final int index) {
    return children.get(index);
  }

  @Override
  public void printTree() {
    for (final UnorderedTree<T> t : children) {
      t.printTree();
      System.out.print(" ");
    }
    System.out.println(value);
  }

}
