package main.java.JosanCristi;

import java.util.Scanner;

public class josancristi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti virsta dvs: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Sunteti major");
        } else {
            System.out.println("Nu sunteți major");
        }
    }
}

