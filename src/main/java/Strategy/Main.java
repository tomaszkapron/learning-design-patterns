package Strategy;

public class Main {
    public static void main(String[] args) {
        Duck wildDuck = new Duck("Ben", new SimpleFly(), new SimpleDisplay());

        wildDuck.display();
        wildDuck.fly();
    }
}