package org.chris.designpattern.observer;

/**
 * The Observer Pattern defines a one-to-many dependency between objects so that
 * when one object changes state, all of its dependents are notified and updated
 * automatically.
 * 
 * Design Principle Strive for loosely coupled designs between objects that
 * interact.
 * 
 * @author Chris
 * 
 */
public interface Observer {

	public void update(float temperature, float humidity, float pressure);
}
