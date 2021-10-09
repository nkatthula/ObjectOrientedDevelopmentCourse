package main.Week6;

public class NitrogenFertilizerManufacturer extends FertilizerManufacturer {
	int numPhosphoruss = 5;   
	int numMicroNutrientss = 10;  
	String microNutrientsMaterial = "micro Nutrients Material";
	String phosphorusMaterial = "phosphorus Material";
	String interiorPhosphorusMaterial = "Sub Phosphorus Material";
	String nitrateMaterial = "nitrate Material";
	public NitrogenFertilizerManufacturer() {
		this.builderName = "Nitrogen Fertilizer Builder";
		setFertilizerType(FertilizerType.Nitrate);
	}
	public FertilizerManufacturer addPhosphorus() {
		for (int i = 0; i < numPhosphoruss-1; i++) {
			fertilizer.addPhosphorus(new Phosphorus(interiorPhosphorusMaterial));
		}
		fertilizer.addPhosphorus(new SubFertilizer(phosphorusMaterial));
		return this;
	}
	public FertilizerManufacturer addMicroNutrients() {
		for (int i = 0; i < numMicroNutrientss; i++) {
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