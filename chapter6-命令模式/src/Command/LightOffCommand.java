package Command;

import Equipment.Light;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 16:30
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
