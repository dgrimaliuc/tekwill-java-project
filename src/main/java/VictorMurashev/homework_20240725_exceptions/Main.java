package VictorMurashev.homework_20240725_exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be converted into integer");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("The converted number is: " + number);
        } catch (NumberFormatException e) {
            throw new PersonalNumberException("Impossible to parse this string value \'" + input + "\' into Integer");
        }
    }
}
