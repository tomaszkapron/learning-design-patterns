package Command;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ArrayList<>(List.of(new ConcreteCommand(new Receiver()))));
        invoker.invoke();
    }
}