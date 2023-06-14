package anna_gontari;

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        // Check if a number is positive, negative, or zero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("your number > 0");
        } else if (num < 0) {
            System.out.println("your number < 0");
        } else {
            System.out.println("your number = 0");
        }
        //Check if a number is divisible by both 2 and 3.
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please, enter different number: ");
        int num2 = scanner.nextInt();
        if (num2 % 2 == 0 && num2 % 3 == 0) {
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not prime");
        }
        //Determine the grade based on a given score.
        int your_score = 76;
        switch (your_score / 10) {
            case 10:
            case 9:
                System.out.println("Your score is A. Congrats!");
                break;
            case 8:
                System.out.println("Your score is B. Not bad.");
                break;
            case 7:
                System.out.println("Your score ic C. Not bad.");
                break;
            default:
                System.out.println("Your score is D. Try better.");

        }

    }

}
