package anna_gontari;

import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
        //Find the square root of a number.
        System.out.println("Please, enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Math.sqrt(n));

        //Generate a random number between 0 and 100. (Try the same between 10 and 100)
        double x = Math.random();
        System.out.println(x*10);

        //Calculate the average of three numbers
        int a,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        sum=a+b+c;
        double avg=sum/3;
        System.out.println("Average of the numbers is "+avg);

        //Find the maximum of 4 numbers.
        int number1 = 25;
        int number2 = 347;
        int number3 = 2;
        int number4 = 42;

        if (number1 > number2) {
            if (number1 > number3)
                if (number1 > number4) {
                    System.out.println("The biggest number is: " + number1);
                }
                } else if (number2 > number3) {
                    System.out.println("The biggest number is: " + number2);
        } else if (number3 > number4) {
                    System.out.println("The biggest number is: " + number3);
                } else {
                    System.out.println("The biggest number is: " + number4);
                }
        //Find the maximum of 4 numbers. the second variation
        int num1 = 34;
        int num2 = 9;
        int num3 = 14;
        int num4 = 41;
        int result = Math.max(num1, num2);
        int result2 = Math.max(num2, num3);
        int result3 = Math.max(result, result2);
        int result4 = Math.max(result3, num4);
        System.out.println("The biggest number is: " + result4);

    }
}
