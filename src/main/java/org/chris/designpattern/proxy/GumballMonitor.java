package org.chris.designpattern.proxy;

/**
 * 
 * The Proxy Pattern
 * 
 * provides a surrogate or placeholder for another object to control access to
 * it.
 * 
 * @author Chris
 * 
 */
public class GumballMonitor {

	private NewGumballMachine machine;

	public GumballMonitor(NewGumballMachine machine) {
		this.machine = machine;
	}

	public void report() {
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount() + " gumballs.");
		System.out.println("Current state: " + machine.getState());
	}
}
