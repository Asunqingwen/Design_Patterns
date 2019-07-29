package Command;

import Equipment.GarageDoor;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 16:47
 */
public class GarageDoorDownCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        System.out.println("Garage Door is down!");
    }

    @Override
    public void undo() {
        System.out.println("Garage Door is up!");
    }
}
