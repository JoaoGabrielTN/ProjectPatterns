package Iterator;

import Strategy.LinkedListStrategy;                                                             // É o normal importar a interface abstrata? 
                                                                                                // Estou fazendo isso pois esse iterador servirá 
                                                                                                // para todas as subclasses de LinkedListStrategy.

public class LinkedListIterator <T extends Comparable<T>> extends Iterator<T> {                 // Ele realmente precisa de um tipo genérico comparável? 
                                                                                                // Creio que não.
                                                                                                    
    public LinkedListIterator(LinkedListStrategy<T> agregator){                                 
        this.first = agregator.getHead();
    }

    /*@Override
    public void First(){                                                                        Porque eu preciso de um método First?
        this.first = this.agregator.getHead();                                                  Talvez não seja um método, e sim um atributo.
    }*/

    @Override
    public Boolean Next() {
        Boolean state = (this.currentNode == null);
        if(state){
            this.currentNode = currentNode.getNext(); 
        } else {
            isDone();
        }
        return state;
    }

    @Override
    public T currentItem() {
        if(currentNode != null) return this.currentNode.getValue();
        else return null;
    }

    @Override
    protected void isDone() {
        this.currentNode = this.first;
    }
    
}
