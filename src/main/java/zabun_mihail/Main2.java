package zabun_mihail;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        PosNeg();
        numbers();
        Score();
    }

    //Check if a number is positive, negative, or zero.
    public static void PosNeg() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Positive num");
        } else if (num < 0) {
            System.out.println("Negative num");
        } else {
            System.out.println("Zero");
        }
    }

    //Check if a number is divisible by both 2 and 3
    public static void numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
    }

    //Determine the grade based on a given score.
    public static void Score() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int score = scanner.nextInt();
        switch (score / 10) {
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
                break;

        }

    }
}

