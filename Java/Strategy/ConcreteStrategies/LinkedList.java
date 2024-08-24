package Strategy.ConcreteStrategies;

import Strategy.LinkedListStrategy;
import Strategy.Node;

public class LinkedList<T extends Comparable<T>> extends LinkedListStrategy<T>{
    public LinkedList(){
        // Default
    }

    @Override
    public void insert(T value){
        if(this.head == null){
            this.head = new Node<T>(value);
        } else {
            Node<T> currNode = this.head;
            Node<T> newNode = new Node<T>(value);

            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }

            currNode.setNext(newNode);
            newNode.setPrevious(currNode);
        }
    }

    @Override
    public Node<T> getHead() {
        return this.head;
    }
}
