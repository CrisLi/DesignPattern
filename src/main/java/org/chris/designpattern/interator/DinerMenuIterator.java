package org.chris.designpattern.interator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] items;
	private int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (items != null && position < items.length && items[position] != null) {
			return true;
		}
		return false;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

}
