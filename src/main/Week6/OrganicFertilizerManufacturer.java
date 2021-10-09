package main.Week6;

public class OrganicFertilizerManufacturer extends FertilizerManufacturer {
	int numPhosphorus = 10;
	int numMicroNutrients = 10;
	String microNutrientsMaterial = "micro Nutrients Material";
	String phosphorusMaterial = "phosphorus Material";
	String nitrateMaterial = "nitrate Material";
	public OrganicFertilizerManufacturer() {
		this.builderName = "OrganicFertilizer Builder";
		setFertilizerType(FertilizerType.MicroNutrients);
	}
	public FertilizerManufacturer addPhosphorus() {
		for (int i = 0; i < numPhosphorus; i++) {
			System.out.println("Adding phosphorus made out of " + phosphorusMaterial);
			fertilizer.addPhosphorus(new Phosphorus(phosphorusMaterial));
		}
		return this;
	}
	public FertilizerManufacturer addMicroNutrients() {
		for (int i = 0; i < numMicroNutrients; i++) {
			System.out.println("Adding microNutrients made out of " + microNutrientsMaterial);
			fertilizer.addMicroNutrients(new MicroNutrients(microNutrientsMaterial));
		}
		return this;
	}
	public FertilizerManufacturer addNitrate() {
		fertilizer.addNitrate(new Nitrate(nitrateMaterial));
		return this;
	}
	public Fertilizer build() {
		System.out.println("Mix everything together");
		return fertilizer;
	}
}