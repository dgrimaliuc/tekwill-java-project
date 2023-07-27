package alexei_drujinin;

import java.util.Scanner;

public class Strings {

    static Scanner scanner = new Scanner(System.in);

    static String value;

    public static void main(String[] args) {
        System.out.println("Enter string");
        value = scanner.nextLine();
        countCharInString();
        stringToUppercase();
        containsSubstring();
        removingWhitespace();
        extractSubstring();
    }

    public static void countCharInString() {
        System.out.println(value.length());
    }

    public static void stringToUppercase() {
        System.out.println(value.toUpperCase());
    }

    public static void containsSubstring() {
        String substring = "ab";
        if (value.contains(substring)) {
            System.out.println("String  contains substring " + substring);
        } else {
            System.out.println("String  does not contain substring " + substring);
        }
    }

    public static void removingWhitespace() {
        System.out.println(value.replaceAll("\\s", ""));
    }

    public static void extractSubstring() {
        System.out.println(value.substring(2, 5));
    }
}
