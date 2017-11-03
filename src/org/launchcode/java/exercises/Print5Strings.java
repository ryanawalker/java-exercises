package org.launchcode.java.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Print5Strings {
    private static void printFives(ArrayList<String> strings) {
        for (String string : strings) {
            if (string.length() == 5) {
                System.out.println(string);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> myStrings = new ArrayList<String>(){{
            add("Tina");
            add("Jeff");
            add("Carlos");
            add("Steve");
            add("Trish");
        }};

        printFives(myStrings);
    }
}
