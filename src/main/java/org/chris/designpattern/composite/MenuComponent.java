package org.chris.designpattern.composite;

/**
 * 
 * 
 * The Composite Pattern
 * 
 * allows you to compose objects into tree structures to represent part-whole
 * hierarchies. Composite lets clients treat individual objects and compositions
 * of objects uniformly.
 * 
 * @author Chris
 * 
 */
public abstract class MenuComponent {

	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}
}
