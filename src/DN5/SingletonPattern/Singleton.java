package DN5.SingletonPattern;
public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton instance created");
    }
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void log(String s){
        System.out.println(s);
    }
}
