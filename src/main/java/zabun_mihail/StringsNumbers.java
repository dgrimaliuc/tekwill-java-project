package zabun_mihail;

import java.util.Scanner;

public class StringsNumbers {

    public static void main(String[] args) {
        Count();
        Upper();
        Substring();
        Whitespaces();
        SpecificSub();
    }

    //1. Count the number of characters in a given string.
    public static void Count() {
        System.out.println("Enter a text:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println(input.length());
    }

    //2. Convert a string to uppercase.
    public static void Upper() {
        System.out.println("Enter a text in lowercase:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println(input.toUpperCase());
    }

    //  5. Extract a substring from a string.
    public static void Substring() {
        System.out.println("Enter a text:");
        Scanner myScanner = new Scanner(System.in);
        String str = myScanner.nextLine();
        System.out.println(str.substring(0, 5));
    }

    //4. Remove all whitespace characters from a string.
    public static void Whitespaces() {
        System.out.print("Enter a text: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        input = input.replaceAll("\\s", "");
        System.out.println(input);
    }

    //3. Check if a string contains a specific substring.
    public static void SpecificSub() {
        System.out.print("Enter a word: ");
        String String = "Check if a string contains a specific substring.";
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println(String.contains(input.trim()));
    }
}