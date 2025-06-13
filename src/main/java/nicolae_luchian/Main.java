package main.java.nicolae_luchian;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi: " + name);

        String greeting = "Hello, World!";
        System.out.println(greeting.length());

        int age1 = 30;
        int age2 = 20;
        System.out.println(age1 >= age2);

        int age3 = 35;
        if (age3 >= 35) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

        int num = -1;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("positive even");
            } else {
                System.out.println("positive odd");
            }
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        Scanner numCheck = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num1 = numCheck.nextInt();

        if (num1 > 0) {
            System.out.println("positive");
        } else if (num1 < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }


        int int4 = 20;
        if (int4 > 0) {
           System.out.println("positive");
        } else if (int4 > 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        int num4 = 20;
        int num5 = 30;
        int num6 = 40;

        int maximum = Math.max(num4, Math.max(num5, num6));
        System.out.println("The maximum number is: " + maximum);


        int num7 = 20;

        switch (num7) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            // Add more cases as needed
            default:
                // Handle the case when num7 is not 10 or 20
                System.out.println("Number is not 10 or 20");
                break;
        }
    }
}


