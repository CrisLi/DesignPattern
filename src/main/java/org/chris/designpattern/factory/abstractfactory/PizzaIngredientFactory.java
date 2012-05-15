package org.chris.designpattern.factory.abstractfactory;

import org.chris.designpattern.factory.ingredient.Cheese;
import org.chris.designpattern.factory.ingredient.Clams;
import org.chris.designpattern.factory.ingredient.Dough;
import org.chris.designpattern.factory.ingredient.Pepperoni;
import org.chris.designpattern.factory.ingredient.Sauce;
import org.chris.designpattern.factory.ingredient.Veggies;

public interface PizzaIngredientFactory {
	
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
}
