package main.Week6;

public class PhosphorusFertilizerManufacturer extends FertilizerManufacturer {
	int numPhosphoruss = 6;
	int numMicroNutrientss = 8;  
	String microNutrientsMaterial = "microNutrients Material";
	String phosphorusMaterial = "phosphorus Material";
	String interiorPhosphorusMaterial = "subPhosphorusMaterial";
	String nitrateMaterial = "Nitrate";
	public PhosphorusFertilizerManufacturer() {
		this.builderName = "Phosphorus Fertilizer Builder";
		setFertilizerType(FertilizerType.Phosphorus);
	}
	public FertilizerManufacturer addPhosphorus() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Mixing phosphorus made out of " + phosphorusMaterial);
			fertilizer.addPhosphorus(new Phosphorus(phosphorusMaterial));
		}
		for (int i = 0; i < numPhosphoruss - 4; i++) {
			System.out.println("Mixing phosphorus made out of " + interiorPhosphorusMaterial);
			fertilizer.addPhosphorus(new SubFertilizer(interiorPhosphorusMaterial));
		}
		return this;
	}
	public FertilizerManufacturer addMicroNutrients() {
		for (int i = 0; i < numMicroNutrientss; i++) {
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