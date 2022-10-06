package Command;

public class ConcreteCommand implements Command {
    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void unexecute() {
        receiver.undoAction();
    }
}
