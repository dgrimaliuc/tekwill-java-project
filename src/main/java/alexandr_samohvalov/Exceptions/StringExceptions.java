package alexandr_samohvalov.Exceptions;

import java.util.Scanner;

public class StringExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputString = scanner.nextLine();

        try {
            int number = Integer.parseInt(inputString);
            System.out.println("Parsed integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Impossible to parse int from string: " + inputString);
        }
    }
}
