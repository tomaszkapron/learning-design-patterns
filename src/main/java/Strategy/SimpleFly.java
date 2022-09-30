package patterns.Strategy.Observer.Strategy;

public class SimpleFly implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("I can simple fly!");
    }
}
