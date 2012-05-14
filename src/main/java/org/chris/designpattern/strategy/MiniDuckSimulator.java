package org.chris.designpattern.strategy;

/**
 * 
 * The Strategy Pattern defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable. Strategy lets the algorithm vary
 * independently from clients that use it.
 * 
 * @author Chris
 * 
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlybehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
