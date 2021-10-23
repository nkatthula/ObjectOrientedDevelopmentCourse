package main.Week8.FinalProject;

public class FertilizerBuilder implements Observer,State{
    
    private String name;
    private int id;
    private String mainIngredient;
    private Farmer farmer;
    
    public FertilizerBuilder() { }

    public FertilizerBuilder(String name, int id, String mainIngredient, Farmer farmer) {
        this.name = name;
        this.id = id;
        this.mainIngredient = mainIngredient;
        this.farmer = farmer;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMainIngredient() {
        return mainIngredient;
    }
    public void setMainIngredient(String dose) {
        this.mainIngredient = mainIngredient;
    }
    public Farmer getFarmer() {
        return farmer;
    }
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
    
    @Override
    public double calculateBill(double p, double n) {
        return p*n;
    }
    
    @Override
    public void Availability() {
    }
}
