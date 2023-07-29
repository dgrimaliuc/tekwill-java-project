package alexei_drujinin.exceptions;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args){
        Scanner numberA = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the first number");
        int a = numberA.nextInt();

        Scanner numberB = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the second number");
        int b = numberB.nextInt();

        calculation(a, b);
    }

    public static void calculation(int a, int b ){
                            try {
        int result = a / b ;
        System.out.println(result);
    }
    catch (ArithmeticException e) {
        System.out.println("Division by zero");
    }
    }
}
