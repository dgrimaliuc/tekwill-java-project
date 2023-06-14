package roman_marcov;

import java.security.acl.Owner;
import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        poNegZero();
        divisibleNum();
        gradeBase();

    }

    //#2. Check if a number is positive, negative, or zero.
    public static void poNegZero() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println(num + " - Is a positive number");
        } else if (num < 0) {
            System.out.println(num + " - Is a negative number");
        } else {
            System.out.println("The number is zero");
        }
    }

    //#3. Check if a number is divisible by both 2 and 3.
    public static void divisibleNum() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan1.nextInt();
        if ((n % 2 == 0) && (n % 3 == 0)) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }

    //#4. Determine the grade based on a given score.
//    A > 90
//    B > 80
//    C > 70
//    Else D
    public static void gradeBase() {

        String grade = null;
        System.out.print("Enter a grade number: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            default:
                grade = "D";
                break;
        }
        System.out.println("Your Grade is  = " + grade);
    }

}
