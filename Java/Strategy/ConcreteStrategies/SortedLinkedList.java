package Strategy.ConcreteStrategies;

import Strategy.LinkedListStrategy;
import Strategy.Node;

public class SortedLinkedList<T extends Comparable<T>> extends LinkedListStrategy<T> {
    public SortedLinkedList(){
        // Default
    }

    @Override                                                                               
    public void insert(T value){
        if(this.head == null){
            this.head = new Node<T>(value);
        } else {
            Node<T> currNode = this.head;
            Node<T> prev = currNode.getPrevious();
            Node<T> newNode = new Node<T>(value);

            while (currNode != null) {

                if(currNode.getValue().compareTo(value) > 0){
                    newNode.setNext(currNode);
                    newNode.setPrevious(currNode.getPrevious());
                    currNode.setPrevious(newNode);

                    if(currNode == getHead()) {
                        this.head = newNode;
                        return;
                    }

                    prev.setNext(newNode);
                    return;
                }
                
                prev = currNode;
                currNode = currNode.getNext();
            }

            prev.setNext(newNode);
            newNode.setPrevious(prev);
        }
    }
}
