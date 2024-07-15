package Musteata_Andrei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 55;
        int totalSum = 0;

        do {
            totalSum += number;
            number++;
        } while (number <= 111);
        System.out.println(totalSum);

        int i;
        for (i = 1; i <= 100; i++) {
            totalSum += i;
        }
        System.out.println(totalSum);


        double[] numbers = {5.5, 7.2, 3.8, 9.0, 4.6, 8.1, 6.3};
        double sum = 0.0;
        for (int a = 0; a < numbers.length; a++) {
            sum += numbers[a];
        }
        System.out.println(sum);
        double average = sum / numbers.length;
        System.out.println("The average value of all elements in the array is: " + average);
    }
}
