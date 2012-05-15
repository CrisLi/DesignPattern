package org.chris.designpattern.factory.abstractfactory;

import org.chris.designpattern.factory.pizza.Pizza;

/**
 * 
 * The Abstract Factory Pattern provides an interface for creating families of
 * related or dependent objects without specifying their concrete classes.
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

	protected abstract Pizza createPizza(String type);
}
