package main.Week5;

public class ShippedState implements State {

	@Override
	public void State(FertilizerSupply fertilizerSupply) {
		System.out.println("Shipment Status:");
		fertilizerSupply.setFertilizerSupply(this);
	}

	@Override
	public String toString() {
		return "Shipment is on the way";
	}
}
