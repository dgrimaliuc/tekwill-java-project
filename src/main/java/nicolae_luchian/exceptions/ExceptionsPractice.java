package main.java.nicolae_luchian.exceptions;

import java.util.Scanner;

public class ExceptionsPractice {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();



        try {
                System.out.println("result = " + a / b);
        } catch (Exception e) {
            System.out.println("division by zero is not possible");
        }
        finally {
            System.out.println("finally block");
        }

        String str = "null";
        try {
            System.out.println(toUpperCase(str));
        } catch (NullPointerException e) {
            System.out.println("String Is Null");
        }
    }

    public static String toUpperCase(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        return str.toUpperCase();
    }
}
