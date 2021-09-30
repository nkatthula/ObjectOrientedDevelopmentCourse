package main.Week4;

public class SpecificationList {
	String name;
	String description;
	boolean toxic;
	double price;
 
	public SpecificationList(String name,
	                String description, 
	                boolean toxic,
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.toxic = toxic;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isToxic() {
		return toxic;
	}
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}

	public void add(SpecificationList specificationList) {
	}
}
