package UlianaScolnicova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
System.out.println("Hello, World!");

/*
Проверить если число позитивное или негативное
int number = 10;
if (number > 0){
    System.out.println("Number is positive");
} else if (number < 0){
    System.out.println("Number is negative");
} else {
    System.out.println("Number is zero");
}
*/

/*
Проверить если число четное или нечетное

    int number = 10;

    if (number % 2 == 0){
        System.out.println("Number is even");
    } else {
        System.out.println("Number is odd");
    }
 */

        /*
        int number = 6;
        if (number % 2 == 0)

         */

 //----------Find sum of two numbers----------//
        int a = 8;
        int b = 3;
        int sum = a + b;
        System.out.println("1) Sum a+b = " + sum);

//----------Check if two numbers are equal----------//
        if (a == b){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("2) Numbers are not equal");
        }

//-----Check if a number is positive, negative, or zero using if-else-----//
if (a > 0){
    System.out.println("3) a is positive");
} else if (a < 0){
    System.out.println("3) a is negative");
    } else {
    System.out.println("3) a is zero");
}
//-----Find the maximum of 2 numbers-----//
        if (a > b){
            System.out.println("4) numberA is bigger than numberB");
        } else if (a < b) {
            System.out.println("4) numberB is bigger than numberA");
        }else {
            System.out.println("4) the numbers are equal");
        }

//-----Ask user to enter his name. Print Hello + name-----//
     String firstName;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your name: ");
     firstName = sc.nextLine();
        System.out.println("Hello, " + firstName);

//-----Ask user to enter his firstName, then lastName. Print Your full name is + firstName lastName-----//


    }
}
