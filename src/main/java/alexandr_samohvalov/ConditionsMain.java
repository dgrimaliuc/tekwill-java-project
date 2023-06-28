package alexandr_samohvalov;

import java.util.Scanner;

public class ConditionsMain {
    // Check if a number is positive, negative, or zero.
    public static void checkNumType(String[] CheckNumType) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is equal to zero");
        }
    }

    //Check if a number is divisible by both 2 and 3.
    public static void numDivisibleBy2and3(String[] NumDivisibleBy2and3) {
        System.out.println("Check if number is divided by 2 and 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce number");
        int a = scanner.nextInt();
        int b = 2;
        int c = 3;
        if (a % b == 0 && a % c == 0) {
            System.out.println("Number can be divided by 2 and 3");
        } else if (a % b == 0) {
            System.out.println("Number can be divided by 2");
        } else if (a % c == 0) {
            System.out.println("Number can be divided by 3");
        } else {
            System.out.println("Number can not be divided by 2 and 3 ");
        }
    }


// Determine the grade based on a given score.

    public static void gradeBaseScore(String[] GradeBaseScore) {
        System.out.println("Determine the grade based on a given score");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce score");
        int score = scanner.nextInt();
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println(" Grade C");
                break;
            default:
                System.out.println("Grade D");
                break;
        }
    }
}