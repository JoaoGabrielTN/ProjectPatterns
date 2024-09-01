package Strategy;

abstract public class LinkedListStrategy <T extends Comparable<T>>{
    protected Node<T> head;
    abstract public void insert(T value);

    public Node<T> getHead() {
        return this.head;
    }
    public void show(){
        Node<T> currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.getValue());
            currNode = currNode.getNext();
        }
        System.out.println();
    };
}
