package ThinkAboutInterfaces;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Animal animal;
        int r;
        Scanner in = new Scanner(System.in);   

        System.out.println("Escolha 0 para pato e 1 para cachorro.");
        r = in.nextInt();
        if (r == 0){
            animal = new Pato();
        } else if (r == 1) {
            animal = new Cachorro();
        } else {
            animal = new Cachorro();
        }

        animal.som();
        in.close();
    }
}
