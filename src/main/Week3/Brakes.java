package main.Week3;

public class Brakes {
	String location;

	public Brakes(String location) {
		this.location = location;
	}

	public void Applied() {
		System.out.println(location + "Breaks are applied");
	}

	public void NotApplied() {
		System.out.println(location + " Breaks are not applied");
	}

}
