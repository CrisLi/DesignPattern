package org.chris.designpattern.factory.pizza;

import org.chris.designpattern.factory.ingredient.Cheese;
import org.chris.designpattern.factory.ingredient.Clams;
import org.chris.designpattern.factory.ingredient.Dough;
import org.chris.designpattern.factory.ingredient.Pepperoni;
import org.chris.designpattern.factory.ingredient.Sauce;
import org.chris.designpattern.factory.ingredient.Veggies;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
