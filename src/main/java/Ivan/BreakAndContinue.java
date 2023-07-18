package Ivan;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Loop until a negative number is entered
        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;  // Exit the loop if the number is negative
            }

            // Task 2: Print numbers from 1 to 10, except 3 and 7
            if (number == 3 || number == 7) {
                continue;  // Skip printing 3 and 7
            }

            System.out.println("Number: " + number);
        }

        System.out.println("Exiting the program.");
        scanner.close();
    }
}
