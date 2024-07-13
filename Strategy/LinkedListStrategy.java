package Strategy;

abstract class LinkedListStrategy <T extends Comparable<T>>{
    protected Node<T> head;
    abstract void insert(T value);
}
