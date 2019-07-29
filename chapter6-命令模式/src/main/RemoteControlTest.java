package main;

import Command.GarageDoorOpenCommand;
import Command.LightOnCommand;
import Equipment.GarageDoor;
import Equipment.Light;
import Remote.SimpleRemoteControl;

/**
 * @author sqw123az@sina.com
 * @date 2019/7/29 0029 15:10
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("");
        GarageDoor garageDoor = new GarageDoor("");

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
