package main.Week4;

public class CountryList implements Lists {
	static final int MAX_ITEMS = 5;
	int numberOfItems = 0;
	SpecificationList[] specificationList;
  
	public CountryList() {
		specificationList = new SpecificationList[MAX_ITEMS];
 
		addItem("STRAIGHT NITROGENOUS FERTILIZERS",
			"Mostly made of Urea", false, 49.99);
		addItem("STRAIGHT PHOSPHATIC FERTILIZERS",
			"Contains Superphosphate and Bone meal", false, 114.99);
		addItem("STRAIGHT POTASSIC FERTILIZERS",
			"These conatins high concentrate of Potassium", false, 149.99);
		addItem("STRAIGHT SULPHUR FERTILIZERS",
			"These conatins high concentrate of Sulphur", true, 88.97);
		addItem("MICRONUTRIENTS",
			"Mix of chemicals", true, 77.99);
	}

	public void addItem(String name, String description,
						boolean toxic, double price)
	{
		SpecificationList specificationLists = new SpecificationList(name, description, toxic, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			specificationList[numberOfItems] = specificationLists;
			numberOfItems = numberOfItems + 1;
		}
	}

	public SpecificationList[] getSpecificationList() {
		return specificationList;
	}

	public CountryListIterator createIterator() {
		return new CountryListIterator(specificationList);

	}
}
