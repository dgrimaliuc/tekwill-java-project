package main.java.PotoracMihai.task8_24_07_2024.Exception.HomeWork_task8;

import java.util.Scanner;

public class Main {

    //Create an unchecked PersonalNumberException. Write a program that asks the user for a string and tries to convert it to a number of int type using the Integer.parseInt() method.
    // If the string cannot be converted to a number, the program should throw a NumberFormatException.
    // Handle this exception and throw your PersonalNumberException with message: “Impossible to parse int from string: ” + stringFromTerminal.
    public static void convertStringToInt(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e) {
            throw new PersonalNumberException("Impossible to parse int from string: " + str);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to convert to an integer: ");
        String input = scanner.nextLine();
        convertStringToInt(input);
    }
}
