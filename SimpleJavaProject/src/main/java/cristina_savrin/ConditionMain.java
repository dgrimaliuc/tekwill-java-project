package cristina_savrin;

import java.util.Scanner;

public class ConditionMain {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = scanner1.nextInt();
        System.out.print("The value " + value);

        // 2. Check if a number is positive, negative, or zero.
        // 3. Check if a number is divisible by both 2 and 3.
        if (value > 0) {
            if (value % 2 == 0 && value % 3 == 0) {
                System.out.println(" is positive and divisible by both 2 and 3");
            } else {
                System.out.println(" is positive and not divisible by both 2 and 3");
            }
        } else if (value < 0) {
            if (value % 2 == 0 && value % 3 == 0) {
                System.out.println(" is negative and divisible by both 2 and 3");
            } else {
                System.out.println(" is negative and not divisible by both 2 and 3");
            }
        } else {
            System.out.println(" is equal to 0 and divisible by both 2 and 3");
        }

        // 4. Determine the grade based on a given score.
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\nEnter a score: ");
        int score = scanner2.nextInt();

        if (score > 90) {
            System.out.println("Your grade: A");
        } else if (score > 80) {
            System.out.println("Your grade: B");
        } else if (score > 70) {
            System.out.println("Your grade: C");
        } else {
            System.out.println("Your grade: D");
        }
    }
}