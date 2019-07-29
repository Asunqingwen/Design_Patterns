package Command;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 19:00
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
    }
}
