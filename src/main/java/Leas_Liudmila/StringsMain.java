package Leas_Liudmila;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        taskCountSymbols();
        taskUppercase();
        taskSpecificSubs();
        removeWhitespaces();
        extractSubstring();
    }

    //1. Count the number of characters in a given string.
    public static void taskCountSymbols() {
        System.out.println("Enter your text:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println(input.length());
    }

    //2. Convert a string to uppercase.
    public static void taskUppercase() {
        System.out.println("Enter your text in lowercase:");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println(input.toUpperCase());
    }

    //3. Check if a string contains a specific substring.
    public static void taskSpecificSubs() {
        System.out.print("Check if your word is included in my text: ");
        String myText = "Java is FUN";
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println(myText.contains(input.trim()));

    }

    //4. Remove all whitespace characters from a string.
    public static void removeWhitespaces() {
        System.out.print("Enter your text with whitespaces: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        input = input.replaceAll("\\s", "");
        System.out.println(input);
    }

    // 5. Extract a substring from a string.
    public static void extractSubstring() {
        String myText = "JAVA is fun";
        System.out.println(myText.substring(0, 4));
    }

}
