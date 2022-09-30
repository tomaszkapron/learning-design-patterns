package patterns.Strategy.Observer.Strategy;

public class SimpleDisplay implements DisplayingStrategy{
    @Override
    public void display() {
        System.out.println("Simply displaying.");
    }
}
