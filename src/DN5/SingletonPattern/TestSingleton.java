package DN5.SingletonPattern;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.log("Application Created");
        s2.log("User Logged in");

        System.out.println(s1==s2);
    }

}
