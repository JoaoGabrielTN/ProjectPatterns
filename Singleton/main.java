package Singleton;

public class main {
    public static void main(String[] args) {
        Singleton teste = Singleton.Instance();
        Singleton teste2 = Singleton.Instance();
        teste.setBg("Red");
        System.out.println(teste2.getBg());
    }   
}
