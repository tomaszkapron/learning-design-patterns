package Observer;

public class SimpleDisplay implements IObserver {
    Termometer termometer;
    int temperature;

    public SimpleDisplay(Termometer termometer) {
        this.termometer = termometer;
    }

    @Override
    public void update() {
        this.temperature = termometer.getTemperature();
        this.displayTemperature();
    }

    void displayTemperature() {
        System.out.println("Temperature is: " + temperature);
    }
}
