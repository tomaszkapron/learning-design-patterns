package patterns.Strategy.Observer.Strategy;

public class Duck {
    private String name;
    private FlyingStrategy flying;
    private DisplayingStrategy displaying;

    public Duck(String name, FlyingStrategy flying, DisplayingStrategy displaying) {
        this.name = name;
        this.flying = flying;
        this.displaying = displaying;
    }

    public void display() {
        this.displaying.display();
    }

    public void fly() {
        this.flying.fly();
    }
}
