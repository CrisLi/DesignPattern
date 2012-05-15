package org.chris.designpattern.factory;

public class VeggiePizza extends Pizza {

	public VeggiePizza() {
		name = "Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
