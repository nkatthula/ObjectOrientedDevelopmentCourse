package main.Week5;

public class AvailabilityState implements State {

	@Override
	public void State(FertilizerSupply fertilizerSupply) {
		System.out.println("Total Stock: ");
		fertilizerSupply.setFertilizerSupply(this);
	}

	@Override
	public String toString(){
		return "Only 10 left in stock";
	}
}
