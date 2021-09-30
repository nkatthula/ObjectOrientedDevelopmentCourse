package main.Week4;

public class MenuSelection {
	public static void main(String args[]) {
		Lists fertilizerList = new FertilizerList();
		Lists countryList = new CountryList();
 
		Supplier supplier = new Supplier(fertilizerList, countryList);
		supplier.printMenu();
	}
}
