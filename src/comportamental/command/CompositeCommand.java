package comportamental.command;

import java.util.ArrayList;
import java.util.List;

import comportamental.command.fx.Command;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for(var command : commands)
            command.execute();
    }
}
