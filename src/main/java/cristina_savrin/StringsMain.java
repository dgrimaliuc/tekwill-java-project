package cristina_savrin;

import java.util.Scanner;

public class StringsMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        // 1. Count the number of characters in a given string.
        System.out.println("> The number of characters in string is: " + string.length());

        // 2. Convert a string to uppercase.
        System.out.println("> The string in uppercase: " + string.toUpperCase());

        // 3. Check if a string contains a specific substring.
        if (string.toLowerCase().contains("java")){
            System.out.println("> The 'java' substring was found." );
        } else {
            System.out.println("> The 'java' substring was not found." );
        }

        // 4. Remove all whitespace characters from a string.
        System.out.println("> String without whitespace characters: " + string.replaceAll("\\s", ""));

        // 5. Extract a substring from a string.
        System.out.println("> Substring extracted: " + string.substring(5));
    }
}