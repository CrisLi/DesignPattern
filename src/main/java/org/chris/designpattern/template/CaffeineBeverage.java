package org.chris.designpattern.template;

/**
 * 
 * The Template Method Pattern
 * 
 * defines the skeleton of an algorithm in a method, deferring some steps to
 * subclasses. Template Method lets subclasses redefine certain steps of an
 * algorithm without changing the algorithm’s structure.
 * 
 * The Hollywood Principle
 * 
 * Don’t call us, we’ll call you.
 * 
 * @author Chris
 * 
 */
public abstract class CaffeineBeverage {

	public final void prepareRecipe() {
		boliWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	private void boliWater() {
		System.out.println("Boiling water");
	}

	protected abstract void brew();

	protected abstract void addCondiments();

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	/**
	 * This is a hook because the subclass can override this method, but doesn’t
	 * have to.
	 * 
	 */
	protected boolean customerWantsCondiments() {
		return true;
	}

}
