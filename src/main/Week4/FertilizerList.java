package main.Week4;

import java.util.ArrayList;
import java.util.List;

public class FertilizerList implements Lists {
	List<SpecificationList> specificationList;

	public FertilizerList() {
		specificationList = new ArrayList<SpecificationList>();


		addItem("Phosphoris",
			"Fertilizers contains high amounts of phosphorus",
			true,
			200.99);
 
		addItem("Nitrogen",
			"Fertilizers contains high amounts of Nitrogen",
			false,
			276.99);
 
		addItem("Potassium",
			"Fertilizers contains high amounts of Potassium",
			true,
			389.49);
 
		addItem("Other",
			"Fertilizers contains high amounts of Other minerals",
			true,
			354.59);
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
