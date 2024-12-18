package main.java.iuliaNamolovan.hm2;

import java.util.Scanner;

public class IN_hm2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:\n");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("esti major");
        } else {
            System.out.println("nu esti major");
        }
    }
}
