package main.Week3;

public class GearShift {
	String location = "";
	int level;
	public static final int DRIVE = 2;
	public static final int NEUTRAL = 1;
	public static final int PARKING = 0;
 
	public GearShift(String location) {
		this.location = location;
	}
  
	public void Drive() {
		// turns the ceiling fan on to high
		level = DRIVE;
		System.out.println(location + " The Gear is in Drive");
 
	} 

	public void Neutral() {
		// turns the ceiling fan on to medium
		level = NEUTRAL;
		System.out.println(location + " The Gear is in Neutral");
	}

	public void Parking() {
		// turns the ceiling fan on to low
		level = PARKING;
		System.out.println(location + "The Gear is in Parking");
	}
 
	public void Reverse() {
		// turns the ceiling fan off
		level = 0;
		System.out.println(location + " The Gear is in Reverse");
	}
 
	public int getSpeed() {
		return level;
	}
}
