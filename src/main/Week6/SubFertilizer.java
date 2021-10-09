package main.Week6;

public class SubFertilizer extends Phosphorus {
	String name;

	public SubFertilizer(String material) {
		super(material);
		this.name = "Mix of Fertilizer made of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
}

 
 
