package comportamental.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
