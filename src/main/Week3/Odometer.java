package main.Week3;

public class Odometer
{
    public static void main (String[] args)
    {
        Odometer2 trip1 = new Odometer2();

        double tripOdometer1;
        double userMilesPerGallon1;
        double gallonsOfGasoline1 = 0;
        double totalOdometer1;

        trip1.setResetOdometer();
        trip1.setUserMilesPerGallon();
        userMilesPerGallon1 = trip1.getUserMilesPerGallon();
        trip1.setTripOdometer();
        tripOdometer1 = trip1.getTripOdometer();
        totalOdometer1 = trip1.getTotalOdometer();
        gallonsOfGasoline1 = trip1.getGallonsOfGasoline();

        System.out.println("For trip1, the trip odometer has been reset to zero miles.");
        System.out.println("Fuel efficiency for your vehicle: " + userMilesPerGallon1 + " mpg.");
        System.out.println("Trip odometer: " + tripOdometer1 + " miles.");
        System.out.println("Total odometer: " + totalOdometer1 + " miles.");
        System.out.println("Number of gallons of gasoline consumed since last reset: " + gallonsOfGasoline1 + " gallons.");

    }
}