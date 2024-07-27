package IvanTrembaci.src.main.java.MironovAnastasia;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lesson1 {
    /*
  1. Check if number is positive,negative,zero
          int number = 0;
          if (number > 0){
              System.out.println("Number is positive");
          }else if(number < 0){
              System.out.println("Number is negative");
          }else {
              System.out.println("Number is zero");
          }
  2. Determine if number is even or odd
          int number = 11;
          if (number % 2 ==0) {
              System.out.println("Number is even");
          } else {
              System.out.println("Number is odd");
          }
  3. Check if a number is divisible both by 2 and 3
          int number = 7;
          if (number % 2 ==0 && number % 3 ==0){
              System.out.println("Number is divisible both by 2 and 3");
          }else {
              System.out.println("Number is not divisible both by 2 and 3");
          }
  4. Read a string from user and print it is length
          String string;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string");
            string = scanner.nextLine();
            System.out.println("Length of the string is:" + string.length());
        }
   Practice:
   1. Find sum of two numbers
        int x = 8;
        int y = 9;
        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " +  sum);
    }
   2. Cheeking if two numbers are equal
        int x = 8;
        int y = 9;
        if (x == y){
            System.out.println("The numbers " + x + " and " + y + " is equal" );
        } else {
            System.out.println("The numbers " + x + " and " + y+ " are not equal");
        }
   3. Cheeking if x is greater than y or y is greater than x or x and y is equal
        int x = 8;
        int y = 9;
        if (x > y){
            System.out.println("X is greater than Y");
        } else if (y > x) {
            System.out.println("Y is greater than X");
        } else{
            System.out.println("X and Y is equal");
        }
   3.1 Cheeking if number(x,y) is positive, negative, zero
    X:
     int x = 8;
        int y = 9;
        if (x > 0){
        System.out.println("X is positive");
    } else if (x < 0) {
            System.out.println("X is negative");
        } else{
            System.out.println("X is zero");
        }
Y:
        int x = 8;
        int y = 9;
        if (y > 0){
          System.out.println("Y is positive");
        } else if (y < 0) {
            System.out.println("Y is negative");
        } else{
            System.out.println("Y is zero");
        }
  5.
       String string;
       Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your firs name");
       String firstname = scanner.nextLine();
            System.out.println("Enter your last name");
       String lastname = scanner.nextLine();
            System.out.println("Hello, " + firstname + " " + lastname + "!");
        }
     */

    public static void main(String[] args) {
        int number = 8;
        switch (number){
            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            default:
                System.out.println("Number is not zero, one or two");

        }
    }
}
