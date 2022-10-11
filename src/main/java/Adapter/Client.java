package Adapter;

public class Client {
    ITarget target;

    public Client(ITarget target) {
        this.target = target;
    }
}
