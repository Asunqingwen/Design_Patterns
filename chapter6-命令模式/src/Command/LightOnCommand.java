package Command;

import Command.Command;
import Equipment.Light;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 15:05
 */


public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
