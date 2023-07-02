package anna_gontari;

import java.util.Scanner;

//Write a program that asks the user for a string and tries to convert it to a number of int type using the Integer.parseInt() method.
// If the string cannot be converted to a number, the program should throw a NumberFormatException.
// Handle this exception to avoid an error in the program. Instead of the error the message "Impossible to parse
// int from string: " + stringFromTerminal
public class StringToNumber {
    public static void convert(String string) {
        try {
            int x = Integer.parseInt(string);
            System.out.println(x);

        } catch (NumberFormatException e) {
            System.out.println("Impossible to parse int from string: " + string);
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter some words:");
        String string = userInput.nextLine();
        convert(string);
    }
}
