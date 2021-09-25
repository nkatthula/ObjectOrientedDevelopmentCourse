package main.Week4;

public class CountryList implements Lists {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	SpecificationList[] specificationLists;
  
	public CountryList() {
		specificationLists = new SpecificationList[MAX_ITEMS];
 
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
			"A hot dog, with sauerkraut, relish, onions, topped with cheese",
			false, 3.05);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 3.89);
	}

	public void addItem(String name, String description,
						boolean vegetarian, double price)
	{
		SpecificationList specificationList = new SpecificationList(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			specificationLists[numberOfItems] = specificationList;
			numberOfItems = numberOfItems + 1;
		}
	}

	public SpecificationList[] getMenuItems() {
		return specificationLists;
	}

	public CountryListIterator createIterator() {
		return new CountryListIterator(specificationLists);
		// To test Alternating menu items, comment out above line,
		// and uncomment the line below.
		//return new AlternatingDinerMenuIterator(menuItems);
	}

	// other menu methods here
}
