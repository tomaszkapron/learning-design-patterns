package Adapter;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new Adapter(new Adaptee()));

        client.target.request();
    }
}
