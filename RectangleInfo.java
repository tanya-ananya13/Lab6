package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String trash = "";
        System.out.println("Please enter the length of side A: ");
        double sideA = 0;
        sideA = in.nextDouble();
        System.out.println("Please enter the length of side B: ");
        double sideB = 0;

        if(in.hasNextDouble())
        {
            sideB = in.nextDouble();
            double area = sideA * sideB;
            System.out.println("The area of the rectangle is side A (" + sideA + ") times side B (" + sideB + ") equals to " + area);
            in.nextLine();
            System.out.println("Please enter the length of side C: ");
            double sideC = 0;
            sideC = in.nextDouble();
            System.out.println("Please enter the length of side D: ");
            double sideD = 0;
            sideD = in.nextDouble();
            double perimeter = sideA + sideB + sideC + sideD;
            System.out.println("The perimeter of the rectangle is side A (" + sideA + ") plus side B (" + sideB + ") plus side C (" + sideC + ") plus side D (" + sideD + ") equals to: " + perimeter);
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect input.");
            System.out.println("Please restart the program and enter the right input.");
            System.exit(0);
        }

        int exp = 2;
        System.out.println("Press enter to find the length of the diagonal.");
        double sideASquared = Math.pow(sideA, exp);
        double sideBSquared = Math.pow(sideB, exp);
        double sideESquared = sideASquared + sideBSquared;
        double sideE = (Math.sqrt(sideESquared));
        in.nextLine();
        System.out.println("The length of the diagonal of the triangle is " + sideE);
    }
}
