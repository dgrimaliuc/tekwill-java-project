package Leas_Liudmila.exceptions;

import java.util.Scanner;

// Write a program that asks the user for a string and tries to convert it to a number of int type using the Integer.parseInt() method.
// If the string cannot be converted to a number, the program should throw a NumberFormatException.
// Handle this exception to avoid an error in the program. Instead of the error the message "Impossible to parse int from string: " + stringFromTerminal
public class Convert {

    public static void convert(String a) {

        try {
            int b = Integer.parseInt(a);
            System.out.println(b);

        } catch (NumberFormatException e) {
            System.out.println("Impossible to parse int from string: " + a);

        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your String:");
        String a = userInput.nextLine();
        convert(a);
    }
}