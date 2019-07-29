package Command;

import Equipment.CeilingFan;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 18:33
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
