package org.chris.designpattern.composite;

public class MenuItem extends MenuComponent {

	private String name;
	private String descritpion;
	private boolean vegetarian;
	private double price;

	public MenuItem(String name, String descritpion, boolean vegetarian, double price) {
		this.name = name;
		this.descritpion = descritpion;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getDescritpion() {
		return descritpion;
	}

	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void print() {
		System.out.print(" " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("	-- " + getDescription());
	}
}
