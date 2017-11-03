package org.launchcode.java.exercises;

import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calculate Area of Rectangle");
        System.out.print("Length: ");
        double length = in.nextDouble();
        System.out.print("Width: ");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("The area of a rectangle with length of " + length +
                            " units and width of " + width + " units is " + area + " square units.");

    }
}
