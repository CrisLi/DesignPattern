package org.chris.designpattern.template;

public class Tea extends CaffeineBeverage {

	@Override
	protected void brew() {
		System.out.println("Steeping tea");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding lemon");
	}

}
