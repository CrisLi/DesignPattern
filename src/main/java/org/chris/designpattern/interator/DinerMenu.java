package org.chris.designpattern.interator;

public class DinerMenu {

	public static final int MAX_ITEMS = 6;

	private MenuItem[] menuItems;

	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}

}
