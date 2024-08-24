package Strategy;

public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> next;
    private Node<T> previous;

    public Node(T value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public Node<T> getNext() {
        return next;
    }
    public T getValue() {
        return value;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getPrevious() {
        return previous;
    }
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
