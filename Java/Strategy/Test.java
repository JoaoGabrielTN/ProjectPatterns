package Strategy;

import Strategy.ConcreteStrategies.LinkedList;
import Strategy.ConcreteStrategies.SortedLinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedListStrategy<Integer> lista = new LinkedList<>();
        LinkedListStrategy<Integer> listaOrdenada = new SortedLinkedList<>();
        
        lista.insert(10);
        lista.insert(20);
        lista.insert(30);
        lista.show();

        listaOrdenada.insert(20);
        listaOrdenada.insert(10);
        listaOrdenada.insert(30);
        listaOrdenada.insert(15);
        listaOrdenada.show();
    }
}
