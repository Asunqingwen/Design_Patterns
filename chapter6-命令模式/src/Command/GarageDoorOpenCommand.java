package Command;

import Equipment.GarageDoor;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 15:16
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        System.out.println("Garage Door is closed!");
    }
}
