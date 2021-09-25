package main.Week4;

public class CountryListIterator implements Iterator {
	SpecificationList[] items;
	int position = 0;
 
	public CountryListIterator(SpecificationList[] items) {
		this.items = items;
	}
 
	public SpecificationList next() {
		/*
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
		*/
		
		// or shorten to 
		return items[position++];
	}
 
	public boolean hasNext() {
		/*
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
		*/
		
		// or shorten to
		return items.length > position;
	}
}
