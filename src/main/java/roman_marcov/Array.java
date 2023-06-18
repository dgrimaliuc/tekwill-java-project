package roman_marcov;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        summAllElements();
        averageValuelements();
        arrayMax();
        arraySecondMax();
    }

    //  1. Write a program that calculates and prints the sum of all elements in an array of integers.
    public static void summAllElements() {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums).sum();
        System.out.println("The sum of all elements in an array is: " + sum);

    }

    /*   2. Create a program that finds and displays the average value
         of all elements in an array of floating-point numbers.
    */
    public static void averageValuelements() {
        int[] num = {1, 2, 3, 4, 5};
        int summ = 0;
        for (int i = 0; i < num.length; i++) {
            summ = summ + num[i];
        }

        System.out.println("Average of all numbers in array is: " + summ / num.length);
    }

    //  3. Find max value in an array with numbers
    public static void arrayMax() {
        int[] tab = {12, 1, 21, 8};
        int max = Arrays.stream(tab).max().getAsInt();
        System.out.println("Max = " + max);
    }

    // 4. ( Optional hard task ) find second max element
    public static void arraySecondMax() {
        int[] tab = {12, 1, 21, 8};
        int min = Arrays.stream(tab).min().getAsInt();
        System.out.println("Min = " + min);
    }
}