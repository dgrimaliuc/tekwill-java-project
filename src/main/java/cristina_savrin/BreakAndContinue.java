package cristina_savrin;

import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {

        // 1. Create a program, which will ask user to enter a number, if number will be negative exit the loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a number: ");
            int value = scanner.nextInt();
            if (value < 0) {
                System.out.println("Exiting, the entered number is negative: " + value);
                break;
            }
        }

        // 2. Create a program which will print all numbers from 1 to 10 except 3 and 7 using continue keyword
        System.out.print("\nPrinting all numbers from 1 to 10 except 3 and 7: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
