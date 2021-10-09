package main.Week6;

import main.Week6.FertilizerManufacturer.FertilizerType;
import java.util.*;

public class Fertilizer {
	String name;
	FertilizerType fertilizerType;
	Nitrate nitrate ;
	List<Phosphorus> phosphorus;
	List<MicroNutrients> microNutrients;

	public Fertilizer() {
		this.phosphorus = new ArrayList<Phosphorus>();
		this.microNutrients = new ArrayList<MicroNutrients>();
	}
	public Fertilizer setFertilizerType(FertilizerType fertilizerType) {
		this.fertilizerType = fertilizerType;
		switch (fertilizerType) {
			case Organic: this.name = "Organic Fertilizer"; break;
			case MicroNutrients: this.name = "Micro Nutrients fertilizer"; break;
			case Nitrate: this.name = "Nitrogen fertilizer"; break;
			case Phosphorus: this.name = "Phosphate fertilizer"; break;
		}
		return this;
	}
	Fertilizer addNitrate(Nitrate nitrate) {
		this.nitrate = nitrate;
		return this;
	}
	Fertilizer addPhosphorus(Phosphorus phosphorus) {
		this.phosphorus.add(phosphorus);
		return this;
	}
	Fertilizer addMicroNutrients(MicroNutrients microNutrients) {
		this.microNutrients.add(microNutrients);
		return this;
	}

	public String toString() {

		StringBuilder display = new StringBuilder();
		display.append("---- " + this.name + " ----\n");
		for (Phosphorus phosphorus : phosphorus) {
			display.append("--- " + phosphorus.name + " ---\n");
		}
		for (MicroNutrients microNutrients : microNutrients) {
			display.append("--- " + microNutrients.name + " ---\n");
		}
		display.append("--- " + nitrate.name + " ---\n");
		return display.toString();
	}
}

 
 
