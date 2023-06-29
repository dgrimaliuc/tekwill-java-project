package tofan_dmitrii;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
// 1.Find the square root of a number.
        System.out.println(Math.sqrt(5));

// 2.Generate a random number between 0 and 100. (Try the same between 10 and 100)
        double a_random = Math.random();
        int up_scale_number = (int) (a_random * 101);
        System.out.println("Your random number is: " + up_scale_number);

        double b_random = Math.random();
        int up_scale_number_2 = (int) (b_random * 91) + 10;
        System.out.println("Your random number between 10 and 100 is:" + up_scale_number_2);

// 3.Check if a number is prime. - canceled

// 4.Calculate the average of three numbers.

        int b = 8;
        int c = 25;
        int i = 65;
        int sum = (b +c + i) / 3;
        System.out.println("Среднее число суммы 3х чисел: = " + sum);

// 5.Find the maximum of 4 numbers
        int num1 = 56;
        int num2 = 129;
        int num3 = 525;
        int num4 = 586;

        if (num1 > num3){
            System.out.println("Max number is: " + num1);
        } else if (num1 > num4) {
            System.out.println("Max number is: " + num1);
        } else if (num2 > num3) {
            System.out.println("Max number is: " + num2);
        } else if (num2 > num4) {
            System.out.println("Max number is: " + num4);
        } else if (num3 > num4) {
            System.out.println("Max number is: " + num3);

        } else {
            System.out.println("Max number is: " + num4);
        }
    }
}
