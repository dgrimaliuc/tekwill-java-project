package SergheiRubailo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        int temp;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X: ");
        x = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Y: ");
        y = Integer.parseInt(scanner.nextLine());

        temp = x + y;
        System.out.println("Sum: " + temp);

        temp = x - y;
        System.out.println("Diff: " + temp);

        temp = x * y;
        System.out.println("Multiplication: " + temp);

        temp = x / y;
        System.out.println("Division: " + temp);

        if (x < y) {
            System.out.println("The smallest number :" + x);
        } else {
            System.out.println("The smallest number :" + y);
        }

        System.out.println("Please enter your age: ");
        age = Integer.parseInt(scanner.nextLine());

        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не совершеннолетний");
        }

    }
}
