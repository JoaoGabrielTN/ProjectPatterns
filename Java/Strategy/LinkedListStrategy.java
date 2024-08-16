package Strategy;
import Iterator.Iterator;                                               // Creio que eu não preciso importar a Interface Iterator
                                                                        // Só preciso importar os ConcreteIterators nas ConcreteStrategies

abstract public class LinkedListStrategy <T extends Comparable<T>>{
    protected Node<T> head;
    abstract public void insert(T value);
    abstract public Iterator<T> createIterator();
    abstract public Node<T> getHead();
}
