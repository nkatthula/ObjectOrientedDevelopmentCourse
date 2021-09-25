package main.Week4;

public class Supplier {
	Lists fertilizerList;
	Lists countryList;

	public Supplier(Lists fertilizerList, Lists countryList) {
		this.fertilizerList = fertilizerList;
		this.countryList = countryList;
	}
 
	public void printMenu() {
		Iterator fertilizerList = fertilizerList.createIterator();
		Iterator countryList = countryList.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(fertilizerList);
		System.out.println("\nLUNCH");
		printMenu(countryList);

	}
 
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			SpecificationList menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

	private void printToxicMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			SpecificationList specificationList = iterator.next();
			if (specificationList.isToxic()) {
				System.out.print(specificationList.getName());
				System.out.println("\t\t" + specificationList.getPrice());
				System.out.println("\t" + specificationList.getDescription());
			}
		}
	}

	private boolean isToxic(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			SpecificationList specificationList = iterator.next();
			if (specificationList.getName().equals(name)) {
				if (specificationList.isToxic()) {
					return true;
				}
			}
		}
		return false;
	}
}
