package org.chris.designpattern.command.remote;

import org.chris.designpattern.command.Command;

public class SimpleRemoteControl {

	private Command slot;

	public SimpleRemoteControl() {
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
