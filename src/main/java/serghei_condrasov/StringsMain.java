package serghei_condrasov;

import java.util.Scanner;

public class StringsMain {

    public static void main(String[] args) {

        System.out.println("Enter your text:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        // 1. Count the number of characters in a given string.
        System.out.println(input.length());

        // 2. Convert a string to uppercase.
        System.out.println(input.toUpperCase());

        // 3. Check if a string contains a specific substring.
        System.out.println(input.contains("Hi"));

        // 4. Remove all whitespace characters from a string.
        System.out.println(input.replaceAll(" ",""));

        // 5. Extract a substring from a string.
        System.out.println(input.substring(0,4));
    }
}
