package Command;

import Equipment.CeilingFan;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 16:50
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        System.out.println("Ceiling Fan is On!");
    }

    @Override
    public void undo() {
        System.out.println("Ceiling Fan is Off!");
    }
}
