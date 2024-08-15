package Singleton;

public class Singleton {
    static private Singleton color = null;
    private String bg;
    
    protected Singleton(){

    }

    public static Singleton Instance(){
        if (color == null){
            color = new Singleton();
        }
        return color;
    } 

    public void setBg(String bg){
        this.bg = bg;
    }

    public String getBg(){
        return this.bg;
    }
}