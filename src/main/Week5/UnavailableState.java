package main.Week5;

public class UnavailableState implements State {

	@Override
	public void State(FertilizerSupply fertilizerSupply) {
		System.out.println("Availability:");
		fertilizerSupply.setFertilizerSupply(this);
	}

	@Override
	public String toString(){
		return "The Fertilizers are unavailable";
	}
}
