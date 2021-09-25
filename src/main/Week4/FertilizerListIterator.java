package main.Week4;

import java.util.List;

public class FertilizerListIterator implements Iterator {
	List<SpecificationList> items;
	int position = 0;
 
	public FertilizerListIterator(List<SpecificationList> items) {
		this.items = items;
	}
 
	public SpecificationList next() {
		/* 
		MenuItem item = items.get(position);
		position = position + 1;
		return item;
		*/
		// or shorten to:
		return items.get(position++);
	}
 
	public boolean hasNext() {
		/*
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
		*/
		// or shorten to:
		return items.size() > position;
	}
}
