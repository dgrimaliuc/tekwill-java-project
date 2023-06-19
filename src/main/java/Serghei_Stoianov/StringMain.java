package Serghei_Stoianov;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter something");
        String a = scanner.nextLine();
        System.out.println("you have entered " + a);

//find a length of a string
        System.out.println("lenght of entered is " + a.length());


//Convert a string to uppercase.
        System.out.println("entered string in uppercase is " + a.toUpperCase());


//Remove all whitespace characters from a string.
        System.out.println("entered whitout spaces is " + a.replace(" ", ""));
        System.out.println();

//Check if a string contains a specific substring.
        scanner = new Scanner(System.in);
        System.out.println("enter a specific text");
        String specSubstring = scanner.nextLine();
        System.out.println("Your text  '" + a + "' contains  '" + specSubstring + "'  " + a.contains(specSubstring));
        System.out.println();


//Extract a substring from a string.
        scanner = new Scanner(System.in);
        System.out.println("enter a specific text, to be extracted");
        String extrtext = scanner.nextLine();
        System.out.println("Text without extracxting part is  '" + a.replace(extrtext, "") + "'");

    }

}



