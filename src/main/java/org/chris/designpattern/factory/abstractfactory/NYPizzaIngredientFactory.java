package org.chris.designpattern.factory.abstractfactory;

import org.chris.designpattern.factory.ingredient.Cheese;
import org.chris.designpattern.factory.ingredient.Clams;
import org.chris.designpattern.factory.ingredient.Dough;
import org.chris.designpattern.factory.ingredient.FreshClams;
import org.chris.designpattern.factory.ingredient.Garlic;
import org.chris.designpattern.factory.ingredient.MarinaraSauce;
import org.chris.designpattern.factory.ingredient.Mushroom;
import org.chris.designpattern.factory.ingredient.Onion;
import org.chris.designpattern.factory.ingredient.Pepperoni;
import org.chris.designpattern.factory.ingredient.RedPepper;
import org.chris.designpattern.factory.ingredient.ReggianoCheese;
import org.chris.designpattern.factory.ingredient.Sauce;
import org.chris.designpattern.factory.ingredient.SlicedPepperoni;
import org.chris.designpattern.factory.ingredient.ThinCrustDough;
import org.chris.designpattern.factory.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
