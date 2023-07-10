package oleg_tabanski;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        //Check if a number is positive, negative, or zero.Number is divisible by both 2 and 3.
        int num = 12;
        if (num % 2==0 && num % 3==0) {
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }
    }
}

