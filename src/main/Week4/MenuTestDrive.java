package main.Week4;

import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
		Lists fertilizerList = new FertilizerList();
		Lists countryList = new CountryList();
 
		Supplier supplier = new Supplier(fertilizerList, countryList);
		
		// With iterators
		supplier.printMenu();
		
		printMenus();
	}
	
	/*
	 * Without the Waitress, we need the code below...
	 */
	public static void printMenus() {
		FertilizerList fertilizerList = new FertilizerList();
		CountryList dinerMenu = new CountryList();

		List<SpecificationList> breakfastItems = fertilizerList.getMenuItems();
		SpecificationList[] lunchItems = dinerMenu.getMenuItems();
		
		// print as Iterable
		printMenu(breakfastItems);
		printMenu(Arrays.asList(lunchItems));
		
		// print with forEach
		System.out.println("=== forEach ===");
		breakfastItems.forEach(item -> System.out.println(item));
		Arrays.asList(lunchItems).forEach(item -> System.out.println(item));
		System.out.println("=== forEach ===");
		
		// Using enhanced for loop
		System.out.println("USING ENHANCED FOR");
		for (SpecificationList menuItem : breakfastItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		for (SpecificationList menuItem : lunchItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
 
		// Exposing implementation
		System.out.println("USING FOR LOOPS");
		for (int i = 0; i < breakfastItems.size(); i++) {
			SpecificationList specificationList = (SpecificationList) breakfastItems.get(i);
			System.out.print(specificationList.getName());
			System.out.println("\t\t" + specificationList.getPrice());
			System.out.println("\t" + specificationList.getDescription());
		}

		for (int i = 0; i < lunchItems.length; i++) {
			SpecificationList menuItem = lunchItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
	
	public static void printMenu(Iterable<SpecificationList> a) {
		for (SpecificationList menuItem : a) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
}
