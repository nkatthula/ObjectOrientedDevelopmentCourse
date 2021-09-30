package main.Week4;

import java.util.List;

public class FertilizerListIterator implements Iterator {
	List<SpecificationList> specs;
	int position = 0;
 
	public FertilizerListIterator(List<SpecificationList> specs) {
		this.specs = specs;
	}
 
	public SpecificationList next() {

		SpecificationList item = specs.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		return specs.size() > position;
	}
}
