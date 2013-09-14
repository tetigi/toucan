package utils;

import java.util.List;

public interface Tree<T> {

    public void map(TreeFunc<T> f);

    public <U> Tree<U> transform(TreeTFunc<T, U> f);

    public <U> Tree<U> depthFirstTransform(TreeNodeTFunc<T, U> f);

    public interface TreeNodeTFunc<T, U> {
	public Tree<U> transformTree(Tree<T> tree);
    }

    public interface TreeFunc<T> {
	public T mapFunction(T elem);
    }

    public interface TreeTFunc<T, U> {
	public U transform(T elem);
    }

    public void addChild(Tree<T> t);

    public Tree<T> getChild(int index);

    public List<Tree<T>> getChildren();

    public void addChildren(List<Tree<T>> children);

    public void printTree();

    public T getValue();

    public void setValue(T t);

    public boolean isLeaf();
}
