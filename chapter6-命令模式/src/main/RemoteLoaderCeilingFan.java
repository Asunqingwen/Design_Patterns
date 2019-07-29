package main;

import Command.CeilingFanHighCommand;
import Command.CeilingFanMediumCommand;
import Command.CeilingFanOffCommand;
import Equipment.CeilingFan;
import Remote.RemoteControlWithUndo;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 18:52
 */
public class RemoteLoaderCeilingFan {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand CeilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanMedium,ceilingFanOff);
        remoteControl.setCommand(1,CeilingFanHigh,ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
