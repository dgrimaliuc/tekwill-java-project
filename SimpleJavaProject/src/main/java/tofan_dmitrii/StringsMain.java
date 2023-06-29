package tofan_dmitrii;


import java.util.Locale;
import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
//  Count the number of characters in a given string.    "Hello Tekwill and QA Automation team!!!"
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a text: ");
        String str = sc.nextLine();
        System.out.println(str.length());

// Convert a string to uppercase.
        String str1 = "Hello Tekwill and QA Automation team!!!";
        System.out.println(str1.toUpperCase(Locale.ROOT));

//  Check if a string contains a specific substring.

        if (str1.contains("QA")) {
            System.out.println("String is correct!");
        } else {
            System.out.println("String is incorrect!");
        }
//  Remove all whitespace characters from a string.

        String str2 = "Hello Tekwill !!!";
        System.out.println(str2.replace("!", "??"));

//  Extract a substring from a string.

        String str3 = "Good Morning! ";
        System.out.println(str3.substring(10));
    }
}



