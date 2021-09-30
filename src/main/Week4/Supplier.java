package main.Week4;

public class Supplier {
	Lists fertilizerList;
	Lists countryList;

	public Supplier(Lists fertilizerList, Lists countryList) {
		this.fertilizerList = fertilizerList;
		this.countryList = countryList;
	}
 
	public void printMenu() {
		Iterator fertilizerIterator = fertilizerList.createIterator();
		Iterator countryIterator = countryList.createIterator();

		System.out.println("List\n----\nChemicals");
		printMenu(fertilizerIterator);
		System.out.println("\nFertilizers");
		printMenu(countryIterator);
	}
 
	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			SpecificationList specificationLists = iterator.next();
			System.out.print(specificationLists.getName() + ", ");
			System.out.print(specificationLists.getPrice() + " -- ");
			System.out.println(specificationLists.getDescription());
		}
	}
}
