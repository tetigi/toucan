package utils;

public interface Tree<T> {

  public void map(TreeFunc<T> f);

  public <U> Tree<U> transform(TreeTFunc<T, U> f);

  public interface TreeFunc<T> {
    public T mapFunction(T elem);
  }

  public interface TreeTFunc<T, U> {
    public U transform(T elem);
  }

  public void addChild(Tree<T> t);

  public Tree<T> getChild(int index);

  public void printTree();

  public T getValue();

  public void setValue(T t);
}
