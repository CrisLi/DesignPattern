package org.chris.designpattern.decorator;

/**
 * 
 * Design Principle
 * 
 * Classes should be open for extension, but closed for modification.
 * 
 * The Decorator Pattern attaches additional responsibilities to an object
 * dynamically. Decorators provide a flexible alternative to subclassing for
 * extending functionality.
 * 
 * @author Chris
 * 
 */
public abstract class Beverage {

	protected String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
