package CristevaEcaterina;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
    /*1.
        int a = 30;
        int b = 15;

        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        double dividing = (double) a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Products of numbers: " + multiplication);
        System.out.println("Quotient of numbers: " + dividing);
2.
        int a = 5;
        int b = 10;
        int min;
        if (a < b) { min = a;
        }
        else {min = b;
        }
        System.out.println("Smallest number: " + min);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int year = scanner.nextInt();

        if (year >= 18) {
            System.out.println("You are of legal age");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
