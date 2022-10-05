package Singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Singleton.instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
