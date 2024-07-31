package IngaTitchiev.HW2407;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to an integer: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("The converted number is: " + number);
        } catch (NumberFormatException e) {
            throw new PersonalNumberException("Impossible to parse int from string: " + input);
        }
    }
}
