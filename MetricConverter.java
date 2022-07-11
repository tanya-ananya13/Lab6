package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String trash = "";
        double metersToMiles = 0.000621371;
        double metersToFeet = 3.28084;
        double metersToInches = 39.3701;
        System.out.println("Please enter the number of meters you would like converted: ");
        double meters = 0;

        if(in.hasNextDouble())
        {
            meters = in.nextDouble();
            System.out.println();
            double miles = meters * metersToMiles;
            System.out.println("\nMeters times " + metersToMiles + " equals miles.");
            System.out.println(meters + " meters in miles is ");
            System.out.printf("%3.2f", miles);
            System.out.println();
            System.out.println("\nMeters times " + metersToFeet +" equals feet.");
            double feet = meters * metersToFeet;
            System.out.println(meters + " meters in feet is ");
            System.out.printf("%3.2f", feet);
            System.out.println();
            System.out.println("\nMeters times " + metersToInches +" equals inches.");
            double inches = meters * metersToInches;
            System.out.println(meters + " meters in inches is ");
            System.out.printf("%3.2f", inches);
            System.out.println();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect value");
            System.out.println("Please restart the program and enter the right input");
            System.exit(0);
        }


    }
}
