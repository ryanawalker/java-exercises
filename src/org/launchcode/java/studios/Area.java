package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double area, radius;

        System.out.print("Enter a radius: ");
        radius = in.nextDouble();
        area = Math.pow(radius, 2) * Math.PI;
        System.out.printf("The area of a circle with a radius of %.2f is %.2f.", radius, area);
    }
}