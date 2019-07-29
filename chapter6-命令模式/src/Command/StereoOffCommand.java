package Command;

import Equipment.Stereo;


/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 16:48
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
