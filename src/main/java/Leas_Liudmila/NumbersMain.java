package src.main.java.Leas_Liudmila;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        squareRoot();
        randomNumber();
        randomNumber2();
        primeNumber();
        averNumber();
        maxNumber();
    }
    // 1.Find the square root of a number.

    public static void squareRoot() {
        System.out.println("Enter your number to calculate the square root:");
        Scanner input = new Scanner(System.in);
        System.out.println(Math.sqrt(input.nextFloat()));
    }

    // 2.Generate a random number between 0 and 10.
    public static void randomNumber() {
        System.out.println("Method 1: ");
        int a = (int) (Math.random() * 10);
        System.out.println(a);

    }

    // 3.Generate a random number between 1 and 100.
    public static void randomNumber2() {
        System.out.println("Method 2: ");
        int b = (int) (1 + (Math.random() * 100));
        System.out.println(b);
    }

    // 4. Check if a number is prime.
    public static void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number or not: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is a non-prime number");
        }
    }

    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
    // 5.Calculate the average of three numbers

    public static void averNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to calculate the average: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        System.out.println("The average of three numbers is: " + (number1 + number2 + number3) / 3);
    }

    // 6.  Find the maximum of 4 numbers.
    public static void maxNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers to calculate the max number: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                if (number1 > number4) {
                    System.out.println("The maximum number is: " + number1);
                }
            }
        } else if (number2 > number3) {
            if (number2 > number4) {
                System.out.println("The maximum number is: " + number2);
            }
        } else if (number3 > number4) {
            System.out.println("The maximum number is: " + number3);
        } else {
            System.out.println("The maximum number is: " + number4);
        }
    }
}
