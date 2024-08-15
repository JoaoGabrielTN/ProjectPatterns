package Strategy;
import Iterator.LinkedListIterator;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.insert(10);
        lista.insert(20);
        lista.insert(30);

        LinkedListIterator<Integer> iterator = lista.createIterator();
        while (iterator.Next()) {
            System.out.println(iterator.currentItem());
        }
    }
}
