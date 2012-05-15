package org.chris.designpattern.factory.simplefactory;

import org.chris.designpattern.factory.Pizza;

public class PizzaStore {

	private SimplePizzaFactory factory;

	public void setFactory(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
