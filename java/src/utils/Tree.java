package utils;

public interface Tree<T> {

  public void map(TreeFunc<T> f);

  public interface TreeFunc<T> {
    public T mapFunction(T elem);
  }

  public Tree<T> getChild(int index);

  public void printTree();
}
