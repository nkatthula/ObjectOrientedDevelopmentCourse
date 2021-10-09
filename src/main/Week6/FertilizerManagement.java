package main.Week6;

public class FertilizerManagement {

	public static void main(String[] args) {

		FertilizerManufacturer nitrateManufacturer = new NitrogenFertilizerManufacturer();
		Fertilizer nitrateFertilizer = nitrateManufacturer.addPhosphorus().addMicroNutrients().addNitrate().build();
		System.out.println(nitrateFertilizer);

		FertilizerManufacturer phosphateManufacturer = new PhosphorusFertilizerManufacturer();
		Fertilizer phosphateFertilizer = phosphateManufacturer.addPhosphorus().addMicroNutrients().addNitrate().build();
		System.out.println(phosphateFertilizer);

		FertilizerManufacturer microNutrientsManufacturer = new OrganicFertilizerManufacturer();
		Fertilizer microNutrientsFertilizer = microNutrientsManufacturer.addPhosphorus().addMicroNutrients().addNitrate().build();
		System.out.println(microNutrientsFertilizer);
	}
}
