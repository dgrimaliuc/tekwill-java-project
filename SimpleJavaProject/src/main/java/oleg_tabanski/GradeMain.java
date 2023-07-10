package oleg_tabanski;

import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {
        //Check if a n.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a score: ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }


    }
}
