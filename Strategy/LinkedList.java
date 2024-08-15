package Strategy;


import Iterator.LinkedListIterator;

public class LinkedList<T extends Comparable<T>> extends LinkedListStrategy<T>{
    public LinkedList(){
        // Default
    }

    @Override
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

    @Override
    public Node<T> getHead() {
        return this.head;
    }

    @Override
    public LinkedListIterator<T> createIterator() {
        // TODO Auto-generated method stub
        return new LinkedListIterator<T>(this);
    }
}
