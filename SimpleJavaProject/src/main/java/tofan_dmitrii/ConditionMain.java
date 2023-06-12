package tofan_dmitrii;

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
// 1. Check if a number is positive, negative, or zero.      int a = -2; - вариант без Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("a > 0");
        } else if (a < 0) {
            System.out.println("a < 0");
        } else {
            System.out.println("a = 0");
        }

//3. Check if a number is divisible by both 2 and 3.
        int num = 6;
        System.out.println("Enter a number: ");

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is even");
        }
//    4. Determine the grade based on a given score.
//A > 90
//B > 80
//C > 70
        int score = 25;
        if (score >= 90) {
            System.out.println("Score: A");
        } else if (score >= 80) {
            System.out.println("Score: B");
        } else if (score >= 70) {
            System.out.println("Score: C");
        } else {
            System.out.println("Score: F");
        }
    }
}

