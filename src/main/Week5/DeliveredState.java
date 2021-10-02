package main.Week5;

public class DeliveredState implements State {

	@Override
	public void State(FertilizerSupply fertilizerSupply) {
		System.out.println("Delivery Status: ");
		fertilizerSupply.setFertilizerSupply(this);
	}

	@Override
	public String toString(){
		return "Delivered";
	}
}
