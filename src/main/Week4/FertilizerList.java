package main.Week4;

import java.util.ArrayList;
import java.util.List;

public class FertilizerList implements Lists {
	List<SpecificationList> specificationList;

	public FertilizerList() {
		specificationList = new ArrayList<SpecificationList>();


		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles with your choice of blueberries or strawberries",
			true,
			3.59);
	}


	public void addItem(String name, String description,
						boolean vegetarian, double price)
	{
		SpecificationList specificationList = new SpecificationList(name, description, toxic, price);
		specificationList.add(specificationList);
	}

	public List<SpecificationList> getMenuItems() {
		return specificationList;
	}

	public CountryListIterator createIterator() {
		return new CountryListIterator(specificationList);
	}

	public String toString() {
		return "Objectville Pancake House Menu";
	}

	// other menu methods here
}
