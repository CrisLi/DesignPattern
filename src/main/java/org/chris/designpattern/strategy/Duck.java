package org.chris.designpattern.strategy;

/**
 * Design Principle Favor composition over inheritance.
 * 
 * change behavior at runtime
 * 
 * @author Chris
 * 
 */
public abstract class Duck {

	protected QuackBehavior quackBehavior;

	protected FlyBehavior flybehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flybehavior.fly();
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}

	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	public abstract void display();

	public void swin() {
		System.out.println("All ducks float, even decoys!");
	}
}
