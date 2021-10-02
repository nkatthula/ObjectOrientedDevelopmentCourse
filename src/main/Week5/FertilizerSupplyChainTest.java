package main.Week5;

public class FertilizerSupplyChainTest {

	public static void main(String[] args) {
		FertilizerSupply fertilizerSupply = new FertilizerSupply();

		AvailabilityState availabilityState = new AvailabilityState();
		availabilityState.State(fertilizerSupply);
		System.out.println(fertilizerSupply.getFertilizerSupply().toString());
		System.out.println();

		UnavailableState unavailableState = new UnavailableState();
		unavailableState.State(fertilizerSupply);
		System.out.println(fertilizerSupply.getFertilizerSupply().toString());
		System.out.println();

		ShippedState shippedState = new ShippedState();
		shippedState.State(fertilizerSupply);
		System.out.println(fertilizerSupply.getFertilizerSupply().toString());
		System.out.println();

		DeliveredState deliveredState = new DeliveredState();
		deliveredState.State(fertilizerSupply);
		System.out.println(fertilizerSupply.getFertilizerSupply().toString());
		System.out.println();

	}
}
