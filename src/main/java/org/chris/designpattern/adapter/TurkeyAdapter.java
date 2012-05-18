package org.chris.designpattern.adapter;

/**
 * The Adapter Pattern
 * 
 * converts the interface of a class into another interface the clients expect.
 * Adapter lets classes work together that couldn’t otherwise because of
 * incompatible interfaces.
 * 
 * @author Chris
 * 
 */
public class TurkeyAdapter implements Duck {

	private Turkey turkey;

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
