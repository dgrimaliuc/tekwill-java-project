package alina_gutsul;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        //Create a program, which will ask user to enter a number, if number will be negative exit the loop
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Negative number entered. Exiting the loop.");
                break;
            }
        }
        scanner.close();

        //Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
