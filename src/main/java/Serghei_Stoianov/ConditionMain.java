package Serghei_Stoianov;

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();

//Check if a number is positive, negative, or zero
        if (a > 0)
            System.out.println("number " + a + " is positive ");
        else if (a < 0)
            System.out.println("number " + a + " is negative ");
        else System.out.println(a + " is zero ");

//Check if a number is divisible by both 2 and 3.
        if (a % 2 == 0 & a % 3 == 0)
            System.out.println("number " + a + " is divisible by both 2 and 3");
        else
            System.out.println("number " + a + " is not divisible by both 2 and 3");

//Determine the grade based on a given score.
        System.out.println("enter a given score");
        int score = scanner.nextInt();
        score = score / 10;
        switch (score) {
            case 10:
            case 9:
                System.out.println("grade A");
                break;
            case 8:
                System.out.println("grade B");
                break;
            case 7:
                System.out.println("grade C");
                break;
            default:
                System.out.println("grade D");
        }
    }

}
