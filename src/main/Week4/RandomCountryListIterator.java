package main.Week4;

import java.util.Calendar;

public class RandomCountryListIterator implements Iterator {
	SpecificationList[] list;
	int position;

	public RandomCountryListIterator(SpecificationList[] list) {
		this.list = list;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	public SpecificationList next() {
		SpecificationList menuItem = list[position];
		position = position + 2;
		return menuItem;
	}
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	public String toString() {
		return "Alternating Diner Menu Iterator";
	}
}
