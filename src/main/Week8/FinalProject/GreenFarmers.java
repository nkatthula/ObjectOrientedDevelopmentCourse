package main.Week8.FinalProject;

public class GreenFarmers extends FertilizerBuilder {
   
    private String Instructions;
    private int productQuantity;
    private double price;

    public GreenFarmers() {
    }

    public GreenFarmers(String Instructions, String name, int id, String mainIngredient, int productQuantity,
                        double price, Farmer farmer) {
       
        super(name, id, mainIngredient, farmer);
        this.Instructions = Instructions;
        this.price =  price;
        this.productQuantity = productQuantity;
    }
    
    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }
    
    @Override
    public double calculateBill(double  price,double productQuantity ){
        return price*productQuantity;
    }

    public double displayPrice(double price) {
    	return price;
    }

    @Override
    public void Availability() {
        System.out.println("Let us Check in Stock"
                + "\n Wait a minute Please");
        
    }
}
