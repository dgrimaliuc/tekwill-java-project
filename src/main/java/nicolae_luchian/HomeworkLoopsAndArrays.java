package main.java.nicolae_luchian;

import java.util.Scanner;

public class HomeworkLoopsAndArrays {
    public static void main(String[] args) {
        // calculate the sum of all numbers from 1 to 100 using a for loop
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.println(total);

        // calculate the sum of all numbers from 55 to 111 using a do-while loop
        int total2 = 0;
        int i = 55;
        do {
            total2 += i;
            i++;
        } while (i <= 111);
        System.out.println(total2);

        // find an element in the array of numbers
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = number.nextInt();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == number1) {
                System.out.println("The number 7 is at index " + j);
            }
        }

        // count the number of positive numbers in the array of numbers
        int[] numbers1 = {1, -2, 3, 4, -5, 6, 7, 8, -9, 10};
        int positiveCount = 0;
        for (int k = 0; k < numbers1.length; k++) {
            if (numbers1[k] > 0) {
                positiveCount++;
            }
        }
        System.out.println(positiveCount);
    }
}

