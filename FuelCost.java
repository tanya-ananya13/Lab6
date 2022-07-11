package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String trash = "";
        System.out.println("Please enter the price of gas per gallon: ");
        double gasPricePerGallon = 0;

        Scanner in = new Scanner(System.in);

        if(in.hasNextDouble())
        {
            gasPricePerGallon = in.nextInt();
            System.out.println("Please enter the gallons of gas you would like to know the price of:");
            int gallonsGasTank = 0;
            gallonsGasTank = in.nextInt();
            System.out.println("The price of " + gallonsGasTank + " gallons is $" + (gasPricePerGallon * gallonsGasTank));
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered: " + trash);
            System.out.println("Please restart the program and re-enter the right input.");
            System.exit(0);
        }

        System.out.println("What is the fuel efficiency of your car in miles per gallon? ");
        int fuelEfficiency = 0;

        if(in.hasNextInt())
        {
            fuelEfficiency = in.nextInt();
            System.out.println("How many gallons are currently in your car?");
            int gallonsInCar = 0;
            gallonsInCar = in.nextInt();
            System.out.println("The number of miles your car can go with " + gallonsInCar + " gallons is " + (fuelEfficiency * gallonsInCar));
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered: " + trash);
            System.out.println("Please restart the program and re-enter the right input.");
            System.exit(0);
        }
    }
}
