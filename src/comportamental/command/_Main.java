package comportamental.command;

import comportamental.command.editor.*;
import comportamental.command.fx.*;

public class _Main {
	public static void main(String[] args) {
        // simple command
        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button(command);
        button.click();
        // composite commands
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        // undoabale commands
        var document = new HtmlDocument();
        var history = new History();
        var boldCommand = new BoldCommand(document, history);
        document.setContent("Hello World!");
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
	}
}
