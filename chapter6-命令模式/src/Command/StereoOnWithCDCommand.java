package Command;

import Equipment.Stereo;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 16:32
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        System.out.println("Stereo is off!");
    }
}
