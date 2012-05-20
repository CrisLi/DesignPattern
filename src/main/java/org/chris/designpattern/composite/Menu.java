package org.chris.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

	private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
}
