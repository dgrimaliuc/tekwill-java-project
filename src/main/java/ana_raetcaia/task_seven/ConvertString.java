package ana_raetcaia.task_seven;

import java.util.Scanner;

public class ConvertString {
    //Write a program that asks the user for a string and tries to convert it to a number of int type using the Integer.
    // parseInt() method. If the string cannot be converted to a number, the program should throw a NumberFormatException.
    // Handle this exception to avoid an error in the program.
    // Instead of the error the message "Impossible to parse int from string: " + stringFromTerminal
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to convert to a number of int: ");
        String input = scanner.next();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted string to int: " + number);
        } catch (NumberFormatException e){
            throw new NumberFormatException ("Impossible to parse int from string: " + input);
        }
    }
}
