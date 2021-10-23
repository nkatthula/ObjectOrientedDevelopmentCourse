package main.Week8.FinalProject;

public class CommercialFarmers extends FertilizerBuilder {
    
    private String Instructions;
    private int productQuantity;
    private double Price;

    public CommercialFarmers() {
    }

    public CommercialFarmers(String Instructions, String name, int id,
                             String dose, int noOfTablets, Farmer farmer, double price_Per_Tablets) {
        
        super(name, id, dose, farmer);
        this.Instructions = Instructions;
        this.Price =  price_Per_Tablets;
        this.productQuantity = noOfTablets;
    
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int noOfTablets) {
        this.productQuantity = noOfTablets;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }
    
    @Override
    public double calculateBill(double  Price,double noOfTablets ){
        return Price*noOfTablets;
    }
    
    @Override
    public void Availability() {
        System.out.println("Let us Check in Stock"
                + "\n Wait a minute Please");
        
    }
}
