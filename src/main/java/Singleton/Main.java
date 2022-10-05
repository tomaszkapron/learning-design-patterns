package Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        System.out.println("Two instaces are the same instance:");
        System.out.println(firstInstance.equals(secondInstance));
        System.out.println("Id of first: " + System.identityHashCode(firstInstance));
        System.out.println("Id of second: " + System.identityHashCode(secondInstance));
    }
}
