package main.Week8.FinalProject;

public class StockFactory {
	 String Stock="Stock Avialable Yet";
     String Stock_Info="After 10 Day, Please Order more Inventory";

    public StockFactory(String Stock, String Stock_Info) {
        this.Stock = Stock;
        this.Stock_Info = Stock_Info;
    }

    public StockFactory() {
    }
   
    public void Display() {
        System.out.println("Stock = "+Stock);
        System.out.println("Stock Info = "+Stock_Info);
        
    }
}
