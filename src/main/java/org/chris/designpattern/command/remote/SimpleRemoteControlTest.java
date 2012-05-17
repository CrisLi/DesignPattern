package org.chris.designpattern.command.remote;

import org.chris.designpattern.command.Light;
import org.chris.designpattern.command.LightOnCommand;

public class SimpleRemoteControlTest {

	public static void main(String[] args) {

		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();

		remote.setSlot(new LightOnCommand(light));
		remote.buttonWasPressed();
	}
}
