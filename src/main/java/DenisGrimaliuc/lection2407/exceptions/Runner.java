package DenisGrimaliuc.lection2407.exceptions;

import java.util.Scanner;

import static java.lang.Float.isInfinite;

public class Runner {

    //Create a method “divide” and inside print result. Catch a ArithmeticException and print Not a Number.
    public static double divide1(double a, double b) {
        try {
            var result = a / b;
            if (isInfinite((float) result)) {
                throw new ArithmeticException();
            }
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Not a Number");
            return 0;
        }
    }

    // Create a “printSecond” method and inside print the second element of an array.
    // Inside method catch ArrayIndexOutOfBoundsException and print Not Found on catch.
    public static void printSecond1(Object[] arr) {
        try {
            System.out.println(arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not Found");
        }
    }

    // Create a method “divide” and inside print result.
    // If the second element is zero, throw an Arithmetic exception.
    public static void divide2(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("The Second number cannot be 0");
        }
        System.out.println(a / b);
    }

    // Create a “printSecond” method and inside print the second element of an array.
    // If the array has length < 2 then throw the IndexOfBound exception.
    public static void printSecond2(Object[] arr) {
        if (arr.length < 2) {
            throw new ArrayIndexOutOfBoundsException("The array has length < 2");
        }

        System.out.println(arr[1]);

    }

    public static void toUpperCase(String str) {
        if (str == null) {
            throw new PersonalNullException("The provided string is null");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(str.toUpperCase());
    }


    // Create a checked exception PersonalBoundException. Create a “printSecond” method and inside print the second element of an array.
    // If the array has length < 2 then throw the PersonalBoundException exception.
    public static void printSecond3(Object[] arr) throws PersonalBoundException {
        if (arr.length < 2) {
            throw new PersonalBoundException("The array has length < 2");
        }

        System.out.println(arr[1]);

    }

    public static void main(String[] args) {
        try {
            printSecond3(new Object[]{1});
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        divide2(5, 0);
//        toUpperCase(null);
    }
}
