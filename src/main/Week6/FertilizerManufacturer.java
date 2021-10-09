package main.Week6;

public abstract class FertilizerManufacturer {
	String builderName;
	enum FertilizerType {
		Nitrate, Phosphorus, MicroNutrients, Organic
	}
	FertilizerType fertilizerType;
	Fertilizer fertilizer = new Fertilizer();
	
	public void setFertilizerType(FertilizerType fertilizerType) {
		this.fertilizerType = fertilizerType;
		fertilizer.setFertilizerType(fertilizerType);
	}
	public abstract FertilizerManufacturer addPhosphorus();
	public abstract FertilizerManufacturer addNitrate();
	public abstract FertilizerManufacturer addMicroNutrients();

	public Fertilizer build() {
		return fertilizer;
	}
}