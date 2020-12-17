package command;

/**
 * @author EricRaww
 * @create 2020-12-17
 */
public interface Command {
    void execute();
    void undo();
}
