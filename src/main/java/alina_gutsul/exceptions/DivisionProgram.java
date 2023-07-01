package alina_gutsul.exceptions;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        try {
            int result = divideNumbers(number1, number2);
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}
