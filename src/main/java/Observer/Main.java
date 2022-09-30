package Observer;

public class Main {
    public static void main(String[] args) {
        Termometer termometer = new Termometer();
        SimpleDisplay display = new SimpleDisplay(termometer);
        termometer.addObserver(display);
        try {
            termometer.collectTemperature();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
