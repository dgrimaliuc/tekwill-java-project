package Leas_Liudmila;

import java.util.Scanner;

public class ifElseSwitch {
    public static void main(String[] args) {
        positiveNegativeNumber();
        divisibleNumber();
        grade();
    }

    // 1. Check if a number is positive, negative, or zero.
    public static void positiveNegativeNumber() {
        System.out.println("Check if your number is positive, negative or zero. Enter your number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }

    //2. Check if a number is divisible by both 2 and 3.
    public static void divisibleNumber() {
        System.out.println("Check if your number is divisible by 2 and 3. Enter your number:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if ((value % 2 == 0) && (value % 3 == 0)) {
            System.out.println("Your number is divisible by both 2 and 3");
        } else if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("Your number is  divisible by one of 2 and 3");
        } else {
            System.out.println("Your number is not divisible by both 2 and 3");
        }
    }

    //3. Determine the grade based on a given score.

    public static void grade() {
        System.out.println("Enter your score:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Your grade is A");
                break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            default:
                System.out.println("Your grade is D");
                break;

        }
    }
}

