package main.java.PotoracMihai.Methods;

public class FirstMethod {

    /*static double sum (double a, double b) {
        return a + b;
    }

    static String oddOrEven(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }
*/
    //1. Write a Java method called "greet" that prints a greeting message to the console, such as "Hello World! »
    static void greet() {
        System.out.println("Hello World!");
    }

    //2. Write a method that takes two integers as parameters and returns difference.(-)
    static int difference(int a, int b) {
        return a - b;
    }

    //3. Create a method that accepts three integers as parameters and returns the maximum of the three.
    static int maxOfThree(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    //4. Create a method that will accept arguments of Integer type, return the sum of all provided numbers.
    static int sum(int num1, int num2, int num3) {
        int sum = 0;
        sum = num1 + num2 + num3;
        System.out.println(sum);
        return sum;
    }

    //5. Write a Java method called "printNumbers"
    // that takes an integer as a parameter and prints all the numbers from 1 to that integer.
    static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //double Z = sum(5, 6);
        // System.out.println(z);
        greet();
        difference(6, 2);
        maxOfThree(5, 6, 7);
        sum(4, 7, 2);
        printNumbers(10);

    }
}
