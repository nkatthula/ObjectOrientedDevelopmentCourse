package main.Week4;

public class ArrayIterator implements Iterator {
	SpecificationList[] items;
	int position = 0;
 
	public ArrayIterator(SpecificationList[] items) {
		this.items = items;
	}
 
	public SpecificationList next() {
		SpecificationList specificationList = items[position];
		position = position + 1;
		return specificationList;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
