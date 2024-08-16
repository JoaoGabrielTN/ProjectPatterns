package Singleton;

public class teste {
    public static void printEchange(){
        Singleton teste = Singleton.Instance();
        System.out.println(teste.getBg());
        teste.setBg("Blue");
    }
}
