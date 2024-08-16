package Singleton;

public class main {
    public static void main(String[] args) {
        Singleton instance = Singleton.Instance();
        Singleton instance2 = Singleton.Instance();
        instance2.setBg("Red");
        System.out.println(instance2.getBg());
        teste.printEchange();
        System.out.println(instance.getBg());
        System.out.println(instance2.getBg());
    }   
}
