package oleg_tabanski;

import java.util.Scanner;

public class LengthMain {
    public static void main(String[] args) {
        //Count the number of characters in a given string.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println(str.length());
    }
}
