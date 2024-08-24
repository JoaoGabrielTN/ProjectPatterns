package Strategy;

abstract public class LinkedListStrategy <T extends Comparable<T>>{
    protected Node<T> head;
    abstract public void insert(T value);
    abstract public Node<T> getHead();
    public void show(){
        Node<T> currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.getValue());
            currNode = currNode.getNext();
        }
        System.out.println();
    };
}
