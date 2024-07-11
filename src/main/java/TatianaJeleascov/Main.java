package main.java.TatianaJeleascov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First Number");
        int numOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Second Number");
        int numTwo = Integer.parseInt(scanner.nextLine());

        calculator(numOne, numTwo);

        System.out.println("The smallest number is: " + numberLow(numOne, numTwo));

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(ageIdentifier(age));
    }

    private static void calculator(int numOne, int numTwo) {
        int temp = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + temp);
        temp = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + temp);
        temp = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + temp);
        temp = numOne / numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + temp);
    }

    private static int numberLow(int numOne, int numTwo) {
        return Math.min(numOne, numTwo);
    }

    private static String ageIdentifier(int age) {
        return (age > 18) ? "Вы совершеннолетний" : "Вы не совершеннолетний";
    }
}


