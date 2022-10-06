package Command;

import java.util.List;

public class Invoker {
    List<Command> commandList; //For example implementation of smart room pilot with few buttons

    public Invoker(List<Command> commandList) {
        this.commandList = commandList;
    }

    void invoke() {
        commandList.forEach(command -> {
            command.execute();
            command.unexecute();
        });
    }
}
