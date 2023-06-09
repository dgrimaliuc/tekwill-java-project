package alina_gutsul;

import java.util.Random;

public class NumbersMain {
    public static void main(String[] args) {
        //Find the square root of a number
        double number = 16;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + ": " + squareRoot);

        // Generate a random number between 0 and 100
        int randomNum1 = new Random().nextInt(101);
        System.out.println("Random number between 0 and 100: " + randomNum1);

        // Generate a random number between 10 and 100
        int randomNum2 = new Random().nextInt(91) + 10;
        System.out.println("Random number between 10 and 100: " + randomNum2);

        // Check if a number is prime
        int ifPrime = 37;
        boolean isPrime = true;

        if (ifPrime <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < ifPrime; i++) {
                if (ifPrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(ifPrime + " является простым числом.");
        } else {
            System.out.println(ifPrime + " не является простым числом.");
        }

        // Calculate the average of three numbers
        int num1 = 10;
        int num2 = 15;
        int num3 = 20;
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average: " + average);

        // Find the maximum of four numbers
        int maxNumber = Math.max(Math.max(15, 25), Math.max(30, 20));
        System.out.println("Maximum number: " + maxNumber);
    }
}
