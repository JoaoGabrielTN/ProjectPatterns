package Strategy;

import Iterator.LinkedListIterator;

public class SortedLinkedList<T extends Comparable<T>> extends LinkedListStrategy<T> {
    public SortedLinkedList(){
        // Default
    }

    @Override                                                                               // Eu preciso codar a implementação correta
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
    public LinkedListIterator<T> createIterator() {
        // TODO Auto-generated method stub
        return new LinkedListIterator<T>(this);
    }
}
