package main.Week8.FinalProject;

public class PastoralFarmers extends FertilizerBuilder {
    
    private String Instructions;
    private int productQuantity;
    private double price;
    
    public PastoralFarmers() {
    }

    public PastoralFarmers(String Instructions) {
        this.Instructions = Instructions;
    }

    public PastoralFarmers(String Instructions, String name, int id,
                           String mainIngredient, int productQuantity, Farmer farmer, double price_Per_Tablets) {
        
        super(name, id, mainIngredient, farmer);
        this.Instructions = Instructions;
         this.price =  price_Per_Tablets;
        this.productQuantity = productQuantity;
    
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setpPice(double price) {
        this.price = price;
    }

    
    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    
     @Override
    public double calculateBill(double  price,double productQuantity ){
        
        return price*productQuantity; 
    
    }

    
    @Override
    public void Availability() {
      
        System.out.println("Let us Check in Stock"
                + "\n Wait a minute Please");
        
    }

}
