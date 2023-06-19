package serghei_condrasov;

import java.util.Scanner;
public class ConditionMain {
    public static void main(String[] args) {
        DefinitionNumber ();
        DivisibleNumber();
        DetermineGrade();
    }
        //1. Check if a number is positive, negative, or zero.
        public static void DefinitionNumber() {
        System.out.println("enter a number:");
        Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println("number is positive");
            } else if (num < 0) {
                System.out.println("number is negative");
            } else {
                System.out.println("number is zero");
            }
    }
        // 2. Check if a number is divisible by both 2 and 3.
        public static void DivisibleNumber() {
            System.out.println("enter a number:");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (number % 2 == 0 && number % 3 == 0)
                System.out.println("number is divisible by both 2 and 3");
            else if (number % 2 == 0 || number % 3 == 0)
                System.out.println("number is divisible by both 2 and 3");
            else System.out.println("number is not divisible by both 2 and 3");

        }
        // 3. Determine the grade based on a given score.
        public static void DetermineGrade() {
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
