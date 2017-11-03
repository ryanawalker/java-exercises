package org.launchcode.java.exercises;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String user = in.nextLine();
        System.out.println("Hello, " + user + ".");

    }
}
