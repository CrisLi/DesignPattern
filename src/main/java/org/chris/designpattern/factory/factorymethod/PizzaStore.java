package org.chris.designpattern.factory.factorymethod;

import org.chris.designpattern.factory.Pizza;

/**
 * 
 * The Factory Method Pattern defines an interface for creating an object, but
 * lets subclasses decide which class to instantiate. Factory Method lets a
 * class defer instantiation to subclasses.
 * 
 * Design Principle
 * 
 * Depend upon abstractions. Do not depend upon concrete classes.
 * 
 * @author Chris
 * 
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	/**
	 * 
	 * A factory method handles object creation and encapsulates it in a
	 * subclass. This decouples the client code in the superclass from the
	 * object creation code in the subclass.
	 * 
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
