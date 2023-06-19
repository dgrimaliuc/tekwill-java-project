package roman_marcov;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        rangeNumberFor();
        sumNumberFor();
        factorialNumberFor();
        stepNumberFor();

    }

    //#1. Print numbers from 1 to 10 using a for loop (using for-each loop)
    public static void rangeNumberFor() {
        System.out.println("\n                     FOR");
        System.out.print("Using for-each loop: ");
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : n) {
            System.out.printf(" " + i);
        }
    }

    //#2. Calculate the sum of numbers from 1 to 100 using a for loop.
    public static void sumNumberFor() {
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            n += i;
        }
        System.out.print(" \nSumm numbers from 1 to 100: " + n);
    }

    //#3. Calculate the factorial of a given number using a for loop.
    public static void factorialNumberFor() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("\nEnter [!] number: ");
        int number = scan1.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + "!" + " is: " + fact);
    }

    //#4. (Optional ) Print all numbers from 20 to 0 with step 2 ( 20, 18, 16, 14)
    public static void stepNumberFor() {
        System.out.print(" \nNumbers from 20 to 0: ");
        for (int i = 20; i >= 1; i = i - 2) {
            System.out.print(i + " ");

        }
    }

}