package anna_gontari;

import java.util.Scanner;

//Write a method that asks the user for two numbers and tries to divide the first number by the second.
// If the second number is zero, the program should throw an ArithmeticException. Handle this exception
// to avoid an error in the program. The message "Division by zero" should be displayed instead of the error
public class DivisionBy0 {

    public static void calculation (int a, int b){
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
    public static void main(String[] args) {
        Scanner numberA = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the first number");
        int a = numberA.nextInt();

        Scanner numberB = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the second number");
        int b = numberB.nextInt();

        calculation(a, b);
    }
}
