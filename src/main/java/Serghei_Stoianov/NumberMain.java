package Serghei_Stoianov;

import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();

//Find the square root of a number.
        System.out.println("square root of a number = " + Math.sqrt(a));

//Generate a random number between 0 and 100. (Try the same between 10 and 100)
        int num = (int) (Math.random() * 100);
        System.out.println("random generated number between 0 and 100= " + num);
        num = (int) (Math.random() * (100 - 10 + 1) + 10);
        System.out.println("random generated number between 10 and 100= " + num);


//Calculate the average of three numbers.
        System.out.println("enter a number");
        int b = scanner.nextInt();
        System.out.println("enter a number");
        int c = scanner.nextInt();
        System.out.println("Average of three numbers " + a + " " + b + " " + c + " " + " is  " + (a + b + c) / 3);

//Find the maximum of 4 numbers
        System.out.println("enter a number");
        int d = scanner.nextInt();
        int max = Math.max(Math.max(Math.max(a, b), c), d);
        System.out.println("maximum of 4 numbers is " + max);

    }
}
