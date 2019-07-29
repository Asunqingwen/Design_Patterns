package Remote;

import Command.Command;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 15:06
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
