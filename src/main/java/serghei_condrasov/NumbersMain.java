package serghei_condrasov;

import java.util.Scanner;

public class NumbersMain {

    public static void main(String[] args) {

        // 1. Find the square root of a number.
        System.out.println("Enter your number :");
        Scanner scan = new Scanner(System.in);
        System.out.println(Math.sqrt(scan.nextFloat()));

        // 2. Generate a random number between 0 and 100. (Try the same between 10 and 100)
        double num = Math.random();
        System.out.println(num*100);

        //3. Calculate the average of three numbers.
        int num1 = 30;
        int num2 = 20;
        int num3 = 10;

        int result = (num1 + num2 + num3) / 3;
        System.out.println("The average of three numbers: " + result);

        // 4. Find the maximum of 4 numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int number3 = sc.nextInt();
        System.out.print("Enter number4: ");
        int number4 = sc.nextInt();

        int result1 = Math.max(number1,number2);
        int result2 = Math.max(result1,number3);
        int result3 = Math.max(result2 ,number4);
        System.out.println("Maximum of 4 numbers: " + result3);
    }
}
