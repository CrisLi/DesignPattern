package org.chris.designpattern.state;

/**
 * 
 * The State Pattern
 * 
 * allows an object to alter its behavior when its internal state changes. The
 * object will appear to change its class.
 * 
 * @author Chris
 * 
 */
public interface State {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
	
}
