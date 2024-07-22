package Musteata_Andrei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int sum = x + y;
        System.out.println("sum=" + sum);
        if (x == y) {
            System.out.println("two numbers are equal");
        } else {
            System.out.println("two numbers are not equal");
        }
        if (x > 0 && y > 0) {
            System.out.println("numbers are bigger than 0");
        } else if (x > 0 && y < 0) {
            System.out.println("only number x is bigger than 0");

        } else if (x < 0 && y > 0) {
            System.out.println("only number y is bigger than 0");

        } else {
            System.out.println("numbers not are bigger than 0 equal to 0");

        }
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        System.out.println("Hello " + name + " " + surname);
    }
}
