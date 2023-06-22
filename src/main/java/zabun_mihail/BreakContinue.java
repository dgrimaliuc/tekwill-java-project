package zabun_mihail;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        negative();
        continueP();

    }

    //1. Create a program, which will ask user to enter a number, if number will be negative exit the loop
    public static void negative() {
        System.out.println("Enter your number: ");
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int x = input.nextInt();
            if (x < 0) {
                break;
            }
        }
    }
    // 2. Create a program which will print all numbers from 1 to 10 except 3 and 7 using continue keyword
    public static void continueP() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
