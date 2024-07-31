package MarcencoAndrei;

import java.util.Scanner;

//Create an unchecked PersonalNumberException. Write a program that asks the user for a string and tries to convert it to a number of int type
//using the Integer.parseInt() method. If the string cannot be converted to a number, the program should throw a NumberFormatException.
//Handle this exception and throw your PersonalNumberException with message: “Impossible to parse int from string: ” + stringFromTerminal.
public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to be converted into integer");
        String input = scanner.nextLine();
        try {
            int a = Integer.parseInt(input);
            System.out.println("Converted number: " + a);
        } catch (NumberFormatException exception) {
            throw new PersonalNumberException("Cannot convert this " + input + " into a number");
        } finally {
            System.out.println("Task Complete!");
        }
    }
}
