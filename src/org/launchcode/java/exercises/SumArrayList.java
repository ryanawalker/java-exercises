package org.launchcode.java.exercises;
import java.util.ArrayList;

public class SumArrayList {
    private static int sumList(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>() {{
            add(3);
            add(2);
            add(9);
            add(20);
            add(1);
            add(12);
            add(13);
            add(25);
            add(953);
            add(21);
        }};
        System.out.println(sumList(numbers));
    }
}
