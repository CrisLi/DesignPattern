package org.chris.designpattern.proxy;

import org.chris.designpattern.state.GumballMachine;

public class NewGumballMachine extends GumballMachine {

	private String location;

	public NewGumballMachine(String location, int numberGumballs) {
		super(numberGumballs);
		this.location = location;
	}

	public String getLocation() {
		return location;
	}
}
