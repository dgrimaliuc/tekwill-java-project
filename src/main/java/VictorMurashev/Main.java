package main.java.VictorMurashev;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");

        /*int a=2; int b=3;
        int c = a + b;
        System.out.println("Sum of the a + b = " + c);*/

        int a = 7;
        int b = 6;
        int c = 5;
        /*if (a == b) {
            System.out.println("Number a equal to b");

        } else {
            System.out.println("Number a is not equal to b");
        }

        if (a > 0){
            System.out.println("Number a is positive");
        }
        else if (a<0) {
            System.out.println("Number a is negative");
        }
        else {
            System.out.println("Number a equal to 0");
        }

        if (a > b && a > c)
            System.out.println("Number a = " + a + " is maximum");
        else if (b > a && b > c)
            System.out.println("Number b = " + b + " is maximum");
        else {
            System.out.println("Number c = " + c + " is maximum");
        }*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First Name");
        String firstName = scanner.nextLine();
        System.out.println("Input Last Name");
        String lastName = scanner.nextLine();



        System.out.println("Your first name is: " + firstName + "; Your last name is: " + lastName);


    }


}
