package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Termometer implements IObservable {
    List<IObserver> subscribers;
    int temperature;

    public Termometer() {
        this.subscribers = new ArrayList<>();
        temperature = -1;
    }

    @Override
    public void addObserver(IObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (IObserver sub: subscribers) {
            sub.update();
        }
    }

    int getTemperature() {
        return temperature;
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    void collectTemperature() throws InterruptedException {
        while(true) {
            int timeToWait = ThreadLocalRandom.current().nextInt(1000, 3000 + 1);
            Thread.sleep(timeToWait);
            this.setTemperature(ThreadLocalRandom.current().nextInt(18, 40 + 1));
            System.out.println("Got new measurement!");
            this.notifySubscribers();
        }
    }
}
