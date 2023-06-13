package src.main.java.Leas_Liudmila;

import java.util.Scanner;

public class forMain {
    public static void main(String[] args) {
        printNum();
        printNum2();
        sumNum();
        factorial();
        printNumber();
    }

    //1.  Print numbers from 1 to 10 using a for loop (using foreach loop)
    public static void printNum() {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNum2() {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : n) {
            System.out.print(num + " ");
        }
    }

    //2. Calculate the sum of numbers from 1 to 100 using a for loop.
    public static void sumNum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = i + sum;
        }
        System.out.println("\n" + sum);
    }

    //3. Calculate the factorial of a given number using a for loop.
    public static void factorial() {
        long f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to calculate factorial:");
        Long x = Long.valueOf(Integer.valueOf(sc.nextLine()));
        for (long i = 1; i <= x; i++) {
            f *= i;
        }
        System.out.println(f);
    }

    //4. (Optional ) Print all numbers from 20 to 0 with step 2 ( 20, 18, 16, 14)
    public static void printNumber() {
        int n = 0;
        for (int i = 20; i >= n; i--) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
        }
    }


}
