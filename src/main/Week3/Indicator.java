package main.Week3;

public class Indicator {
	String location;
	int channel;

	public Indicator(String location) {
		this.location = location;
	}

	public void left() {
		System.out.println("Left Indicator");
	}

	public void right() {
		System.out.println("Right Indicator");
	}

	public void setIndicatorSignal() {
		this.channel = 3;
		System.out.println("The Indicator is set");
	}
}
