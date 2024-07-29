package main.java.PotoracMihai.task8_24_07_2024.Exception;

//Create a method "divide" and inside print result. Catch a ArithmeticException and print Not a Number.

import static java.lang.Float.isInfinite;

public class Runner {
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

    //Create a "printSecond" method and inside print the second element of an array.
    //Inside method catch ArrayIndexOutOfBoundsException and print Not found on catch.

    public static void printSecond(Object[] array) {
        try {
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not found");
        }
    }

    //Create a toUpperCase method and inside print the UpperCase of a provided string.
    //Catch NullPointer exception and on carch print "String Is Null"

    public static void toUpperCase(String string) {
        try {
            System.out.println(string.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("String Is Null");
        }
    }

    //Create a method "divide2" and inside print result.
    // If the second element is zero, throw an Arithmetic exception.
    public static void divide2(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("The second number cannot be 0");
        }
        System.out.println(a / b);
    }

    //Create a "printsecond" mrthod and inside print the second element of an array.
    // If the array has length < 2 then throww the IndexOutOfBoundsException.
    public static void printSecond2(Object[] arr) {
        if (arr.length < 2) {
            throw new ArrayIndexOutOfBoundsException("The array has less than 2 elements");
        }
        System.out.println(arr[1]);
    }

    //Create a toUpperCase method and inside print the UpperCase of a provided string. Throw a NullPointer exception with message
    // "The provided string is null." when string is null.
    public static void toUpperCase2(String str) {
        if (str == null) {
            throw new PersonalNullException("The provided string is null.");
        }
        System.out.println(str.toUpperCase());
    }

    //Create a checked exception PersonalBoundException. Create a "printSecond" method and inside print the seconf element of an array.
    // If the arrau has length < 2 then trow the PersonalBoundException exception.
    public static void printSecond3(Object[] arr) throws PersonalBoundsException {
        if (arr.length < 2) {
            throw new PersonalBoundsException("The array has less than 2 elements");
        }
        System.out.println(arr[1]);
    }


    public static void main(String[] args) {
        divide1(5, 0);
        printSecond(new Object[]{1});
        //toUpperCase(null);
        //divide2(5, 0);
        //printSecond2(new Object[]{1});
        //toUpperCase2(null);
        try {
            printSecond3(new Object[]{1});
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

