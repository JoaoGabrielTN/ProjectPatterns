package Singleton;

public class Singleton {
    private static Singleton instance = null;
    private String bg;
    
    protected Singleton(){

    }

    public static Singleton Instance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    } 

    public void setBg(String bg){
        this.bg = bg;
    }

    public String getBg(){
        return this.bg;
    }
}