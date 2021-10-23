package main.Week8.FinalProject;

import java.util.Scanner;

public class FertilizerManagementSystem {
	public static void main(String[] args) {

        /**-----------------------Welcome logs ----------------------------**/
        System.out.println("-----------Welcome To Fertilizer Management System---------");
        System.out.println("Please Select the Type of Farmer: ");
        System.out.println("For Green Farmers -> Enter 1"
                + "\n For Commercial Farmers -> Enter 2"
                + "\n For Pastoral Farmers -> Enter 3");

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int type = a.nextInt();
        if(type==1){
        
            System.out.println("How Many Fertilizers Do you need?");
            int num = a.nextInt();
            
            for(int j=0; j<num; j++){
                System.out.println("Enter Farmer ID(only digits):");
                int id = a.nextInt();
                System.out.println("Enter Farmer Name: ");
                String name = b.nextLine();
                System.out.println("Enter Email address: ");
                String email = b.nextLine();

                GreenFarmers greenFarmers = new GreenFarmers();
                StockFactory stockFactory = new StockFactory();

                greenFarmers.Availability();
                stockFactory.Display();
                
                System.out.println("Enter Fertilzer Name: ");
                String mainIngredient = b.nextLine();
                
                System.out.println("Enter Fertlizer Quantity: ");
                int no = a.nextInt();
                
                System.out.println("Enter Price per product: ");
                double price =  b.nextDouble();

                System.out.println("Enter Instructions: ");
                String ins = c.nextLine();
                
                Farmer farmer = new Farmer();
                farmer.setName(name);
                farmer.setEmail(email);
                
                GreenFarmers greenFarmers1 = new GreenFarmers(ins,name,id,mainIngredient,no,price, farmer);
                System.out.println("Total Bill is: "+greenFarmers1.calculateBill(price,no));
            }
        }

        else if(type==2){

            System.out.println("How Many Fertilizers Do you need?");
            int num = a.nextInt();

            for(int j=0; j<num; j++){
                System.out.println("Enter Farmer ID(only digits):");
                int id = a.nextInt();
                System.out.println("Enter Farmer Name: ");
                String name = b.nextLine();
                System.out.println("Enter Email address: ");
                String email = b.nextLine();

                CommercialFarmers commercialFarmers = new CommercialFarmers();
                StockFactory stockFactory = new StockFactory();

                commercialFarmers.Availability();
                stockFactory.Display();

                System.out.println("Enter Fertilzer Name: ");
                String mainIngredient = b.nextLine();

                System.out.println("Enter Fertlizer Quantity: ");
                int no = a.nextInt();

                System.out.println("Enter Price per product: ");
                double price =  b.nextDouble();

                System.out.println("Enter Instructions: ");
                String ins = c.nextLine();

                Farmer farmer = new Farmer();
                farmer.setName(name);
                farmer.setEmail(email);

                CommercialFarmers commercialFarmers1 = new CommercialFarmers(ins,name,id,mainIngredient,no,farmer,price);
                System.out.println("Total Bill is: "+commercialFarmers1.calculateBill(price,no));
            }
        }

        else if(type==3){
            System.out.println("Enter Farmer ID(only digits):");
            int num = a.nextInt();

            for(int j=0; j<num; j++){
                System.out.println("Enter Farmer ID: ");
                int id = a.nextInt();
                System.out.println("Enter Farmer Name: ");
                String name = b.nextLine();
                System.out.println("Enter Email address: ");
                String email = b.nextLine();

                PastoralFarmers pastoralFarmers = new PastoralFarmers();
                StockFactory stockFactory = new StockFactory();

                pastoralFarmers.Availability();
                stockFactory.Display();

                System.out.println("Enter Fertilzer Name: ");
                String mainIngredient = b.nextLine();

                System.out.println("Enter Fertlizer Quantity: ");
                int no = a.nextInt();

                System.out.println("Enter Price per product: ");
                double price =  b.nextDouble();

                System.out.println("Enter Instructions: ");
                String ins = c.nextLine();

                Farmer farmer = new Farmer();
                farmer.setName(name);
                farmer.setEmail(email);

                PastoralFarmers pastoralFarmers1 = new PastoralFarmers(ins,name,id,mainIngredient,no,farmer, price);
                System.out.println("Total Bill is: "+pastoralFarmers1.calculateBill(price,no));
            }
        }
        else
            System.out.println("The Option you've selected is unavailable");
       
	}
}
