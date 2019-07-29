package Command;

import Equipment.GarageDoor;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 16:46
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        System.out.println("Garage Door is up!");
    }

    @Override
    public void undo() {
        System.out.println("Garage Door is down!");
    }
}
