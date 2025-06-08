package main.java.alexandru_todos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1: Make 2 variables, execute operations (+-*/) and show results on screen
        int a = 200;
        int b = 50;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        System.out.println("Result of addition is: " + addition);
        System.out.println("Result of subtraction is: " + subtraction);
        System.out.println("Result of multiplication is: " + multiplication);
        System.out.println("Result of division is: " + division);

        // Task 1.1: Show the smallest number between a and b
        if (a < b) {
            System.out.println("Smallest number is " + a);
        } else {
            System.out.println("Smallest number is " + b);
        }

        // Task 2: Get user age and show him if he's adult or minor
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are minor");
        }
    }
}
