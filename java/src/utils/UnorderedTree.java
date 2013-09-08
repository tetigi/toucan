package utils;

import java.util.ArrayList;

public class UnorderedTree<T> implements Tree<T> {

  private final ArrayList<Tree<T>> children = new ArrayList<Tree<T>>();
  private T value;

  public UnorderedTree(final T val, final Tree<T>... trees) {
    value = val;
    for (final Tree<T> t : trees) {
      children.add(t);
    }
  }

  public UnorderedTree(final T val) {
    value = val;
  }

  public UnorderedTree() {
    value = null;
  }

  @Override
  public void map(final utils.Tree.TreeFunc<T> f) {
    for (final Tree<T> t : children) {
      t.setValue(f.mapFunction(t.getValue()));
      t.map(f);
    }
  }

  @Override
  public Tree<T> getChild(final int index) {
    return children.get(index);
  }

  @Override
  public void printTree() {
    for (final Tree<T> t : children) {
      t.printTree();
      System.out.print(" ");
    }
    System.out.println(value);
  }

  @Override
  public <U> Tree<U> transform(final utils.Tree.TreeTFunc<T, U> f) {
    final UnorderedTree<U> ret = new UnorderedTree<U>();
    for (final Tree<T> t : children) {
      ret.setValue(f.transform(t.getValue()));
      ret.addChild(t.transform(f));
    }
    return ret;
  }

  @Override
  public void addChild(final Tree<T> t) {
    children.add(t);
  }

  @Override
  public T getValue() {
    return value;
  }

  @Override
  public void setValue(final T t) {
    value = t;
  }

}
