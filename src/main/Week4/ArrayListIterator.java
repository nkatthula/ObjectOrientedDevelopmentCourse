package main.Week4;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
	ArrayList<SpecificationList> items;
	int position = 0;
 
	public ArrayListIterator(ArrayList<SpecificationList> items) {
		this.items = items;
	}
 
	public SpecificationList next() {
		SpecificationList item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
