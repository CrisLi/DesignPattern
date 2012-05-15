package org.chris.designpattern.factory.pizza;

import org.chris.designpattern.factory.abstractfactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
