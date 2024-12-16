package main.java.IonErm;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int age = 11;
        if (age >= 18) {
            System.out.println("Person is adult!");
        } else {
            System.out.println("Person is not adult!");
        }

        int num = 23;
        if (num > 10) {
            if (num % 2 == 0) {
                System.out.println("Number is positive and even");
            } else {
                System.out.println("Number is positive and odd");
            }
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }


        /*ClassWork*/
        int a = 34;
        int b = 100;
        System.out.println(a + b);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int c = scanner.nextInt();
        System.out.println("Enter another number: ");
        int d = scanner.nextInt();
        if (c == d) {
            System.out.println("Nums is equal");
        } else {
            System.out.println("Nums is not equal");
        }

        int number = 23;
        if (number > 0) {
            System.out.println("Number is positive!");
        } else if (number < 0) {
            System.out.println("Number is negative!");
        } else {
            System.out.println("Number is zero!");
        }

        int num1 = 1000, num2 = 300, num3 = 100;
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + " is greater!");
            } else {
                System.out.println(num3 + " is greater!");
            }
        } else {
            if (num2 >= num3) {
                System.out.println(num2 + " is greater!");
            } else {
                System.out.println(num3 + " is greater!");
            }
        }

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greater!");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater!");
        } else {
            System.out.println(num3 + " is greater!");
        }

        /*HomeWork*/

        //1.	Operații cu variabile:
        double r1 = 10, r2 = 300;
        System.out.println(r1 + r2);
        System.out.println(r1 * r2);
        System.out.println(r1 / r2);
        System.out.println(r1 - r2);
        if (r1 > r2) {
            System.out.println(r1 + " is greater!");
        } else {
            System.out.println(r2 + " is greater!");
        }

        //2.	Verificare vârstă:
        System.out.println("Enter your age:");
        int age1 = scanner.nextInt();
        if (age1 >= 18) {
            System.out.println("You are adult!");
        } else {
            System.out.println("Sorry, you aren't adult!");
        }
    }
}
