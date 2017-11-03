package org.launchcode.java.exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Miles Per Gallon Calculator");
        System.out.print("Miles driven: ");
        double miles = in.nextDouble();
        System.out.print("Gallons of gas consumed: ");
        double gallons = in.nextDouble();
        double mpg = miles / gallons;
        System.out.println("You have consumed " + mpg + " miles per gallon.");
    }
}
