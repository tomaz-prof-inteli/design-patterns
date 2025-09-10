package comportamental.command;

import comportamental.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
