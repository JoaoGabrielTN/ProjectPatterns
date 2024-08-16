package Iterator;

import Strategy.Node;

abstract public class Iterator <T extends Comparable<T>> {
    protected Node<T> first;
    protected Node<T> currentNode;  

    //abstract void First();
    abstract public Boolean Next();
    abstract public T currentItem();
    abstract protected void isDone();

}
