package main.Week4;

public class CountryListIterator implements Iterator {
	SpecificationList[] specs;
	int position = 0;
 
	public CountryListIterator(SpecificationList[] specs) {
		this.specs = specs;
	}
 
	public SpecificationList next() {
		return specs[position++];
	}
 
	public boolean hasNext() {
		return specs.length > position;
	}
}
