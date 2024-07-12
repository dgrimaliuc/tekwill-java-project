package SergheiRubailo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        int z;
        int temp;
        int age;

        String name;
        String surname;
        int sum;

        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Task 1!");
      
        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        System.out.println("Please enter your name: ");
        surname = scanner.nextLine();

        System.out.println("Hello " + name + " " + surname + "!");

        System.out.println("Enter X: ");
        x = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Y: ");
        y = Integer.parseInt(scanner.nextLine());
      
        System.out.println("Enter Z: ");
        z = Integer.parseInt(scanner.nextLine());

        sum = x + y;
        System.out.println("The sum of X and Y numbers: " + sum);

        if (x == y) {
            System.out.println("Numbers X and Y are equal");
        } else {
            System.out.println("Numbers X and Y are NOT equal");
        }

        System.out.println("Maximum number: " + Math.max(Math.max(x, y), z));

      
        System.out.println("Task 2!");
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