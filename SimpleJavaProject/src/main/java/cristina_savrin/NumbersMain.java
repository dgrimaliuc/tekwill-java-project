package cristina_savrin;

import java.util.Scanner;

public class NumbersMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = scanner.nextInt();

        // 1. Find the square root of a number.
        System.out.println("The square root of " + value + " is: " + Math.sqrt(value));

        // 2. Generate a random number between 0 and 100. (Try the same between 10 and 100)
        // Formula: Math.floor(Math.random() * (max - min + 1) + min)
//        System.out.println("Random number between 0 and 100: " + Math.floor(Math.random() * 101));
        System.out.println("\nRandom number between 0 and 100: " + (int)(Math.random() * 101));
//        System.out.println("Random number between 10 and 100: " + Math.floor(Math.random() * (100 - 10 + 1) + 10));
        System.out.println("Random number between 10 and 100: " + (int)(Math.random() * (100 - 10 + 1) + 10));

        // 3. Check if a number is prime.

        // 4. Calculate the average of three numbers.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\nEnter number1: ");
        int number1a = scanner2.nextInt();
        System.out.print("Enter number2: ");
        int number2a = scanner2.nextInt();
        System.out.print("Enter number3: ");
        int number3a = scanner2.nextInt();
        System.out.println("The average of "+number1a+", "+number2a+", "+number3a+" is: "+(number1a+number2a+number3a)/3);

        // 5. Find the maximum of 4 numbers.
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("\nEnter number1: ");
        int number1b = scanner3.nextInt();
        System.out.print("Enter number2: ");
        int number2b = scanner3.nextInt();
        System.out.print("Enter number3: ");
        int number3b = scanner3.nextInt();
        System.out.print("Enter number4: ");
        int number4b = scanner3.nextInt();
        System.out.println("The maximum of "+number1b+", "+number2b+", "+number3b+", "+number4b+" is: "+Math.max(Math.max(Math.max(number1b, number2b), number3b), number4b));
    }
}