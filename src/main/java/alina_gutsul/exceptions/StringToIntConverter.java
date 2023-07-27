package alina_gutsul.exceptions;

import java.util.Scanner;

public class StringToIntConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String userInput = scanner.nextLine();
        scanner.close();

        try {
            int number = Integer.parseInt(userInput);
            System.out.println("The converted integer is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Impossible to parse int from string: " + userInput);
        }
    }
}
