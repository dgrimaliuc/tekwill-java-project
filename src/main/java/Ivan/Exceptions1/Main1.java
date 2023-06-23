package Ivan.Exceptions1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            double result = divideNumbers(num1, num2);
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

    public static double divideNumbers(int num1, int num2) {
        return num1 / num2;
    }
}
