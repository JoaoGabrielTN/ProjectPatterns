package Strategy;

public class LinkedList<T extends Comparable<T>> extends LinkedListStrategy<T>{
    public LinkedList(){
        // Default
    }

    public void insert(T value){
        if(this.head == null){
            this.head = new Node<T>(value);
        } else {
            Node<T> curNode = this.head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(new Node<T>(value));
        }
    }
}
