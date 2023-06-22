package cristina_savrin.oop.exceptions;

import java.util.Scanner;

public class ExceptionsTest {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter the dividend: ");
        int dividend = scanner1.nextInt();

        System.out.print("Please enter the divider: ");
        int divider = scanner1.nextInt();

        division(dividend, divider);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("\nPlease enter the string: ");
        String userString = scanner2.nextLine();

        conversion(userString);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("\nPlease enter the string: ");
        String stringToConvert = scanner3.nextLine();

        try {
            conversion2(stringToConvert);
        } catch (ParseToIntException pie) {
            System.out.println("Custom exception");
        }
    }

    // 1. Write a method that asks the user for two numbers and tries to divide the first number by the second.
    // If the second number is zero, the program should throw an ArithmeticException. Handle this exception to avoid an error in the program.
    // The message "Division by zero" should be displayed instead of the error
    public static void division(double x, double y) {
        try {
            System.out.println("The quotient is: " + x / y);
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero");
        }
    }

    // 2. Write a program that asks the user for a string and tries to convert it to a number of int type using the Integer.parseInt() method.
    // If the string cannot be converted to a number, the program should throw a NumberFormatException.
    // Handle this exception to avoid an error in the program. Instead of the error the message "Impossible to parse int from string: " + stringFromTerminal
    public static void conversion(String s) {
        try {
            System.out.println("The converted string is: " + Integer.parseInt(s));
        } catch (NumberFormatException nfe) {
            System.out.println("Impossible to parse int from string: " + s);
        }
    }

    // 3. Create personal Checked exception with name "ParseToIntException" and method which throws this exception if a string provided as parameter
    // can not be converted to int with Integer.parseToInt() method.
    public static void conversion2(String s) throws ParseToIntException {
        try {
            System.out.println("The converted string is: " + Integer.parseInt(s));
        } catch (NumberFormatException nfe) {
            throw new ParseToIntException(nfe.getMessage());
        }
    }
}