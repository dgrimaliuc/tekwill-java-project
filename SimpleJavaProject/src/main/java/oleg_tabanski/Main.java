package oleg_tabanski;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1.Check if a number is positive, negative, or zero.
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a num: ");
        int num = scanner.nextInt();
       if (num > 0) {
           System.out.println("Positive number");
       }else if (num < 0) {
           System.out.println("Number is negative");
       }else {
           System.out.println("Number is zero");
       }
    }
}
