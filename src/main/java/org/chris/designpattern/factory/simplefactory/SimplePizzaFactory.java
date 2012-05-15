package org.chris.designpattern.factory.simplefactory;

import org.chris.designpattern.factory.CheesePizza;
import org.chris.designpattern.factory.ClamPizza;
import org.chris.designpattern.factory.PepperoniPizza;
import org.chris.designpattern.factory.Pizza;
import org.chris.designpattern.factory.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}

		return pizza;
	}
}
