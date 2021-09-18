package main.Week3;

import java.util.Scanner;

public class Odometer2
{
    private double tripOdometer;
    private double addTrip;
    private double userMilesPerGallon;
    private double calculatedMilesPerGallon;
    private double gallonsOfGasoline = 0;
    private double totalOdometer;

    Scanner keyboard = new Scanner(System.in);

    public void setResetOdometer()
    {
        tripOdometer = 0;
    }
    public void setUserMilesPerGallon()
    {
        System.out.println("Enter fuel efficiency (mpg).");
        userMilesPerGallon = keyboard.nextDouble( );
    }
    public void setTripOdometer()
    {
        System.out.println("Enter miles driven for first trip.");
        addTrip = keyboard.nextDouble( );
        while (addTrip >= 0)
        {
            tripOdometer = tripOdometer + addTrip;
            System.out.println("Enter miles driven for next trip, or -1");
            System.out.println("to exit.");
            addTrip = keyboard.nextDouble( );
        }
        totalOdometer = totalOdometer + tripOdometer;
    }
    public double getUserMilesPerGallon()
    {
        return userMilesPerGallon;
    }
    public double getGallonsOfGasoline()
    {
        gallonsOfGasoline = (tripOdometer / userMilesPerGallon);
        return gallonsOfGasoline;
    }
    public double getTripOdometer()
    {
        return tripOdometer;
    }
    public double getTotalOdometer()
    {
        return totalOdometer;
    }

}
