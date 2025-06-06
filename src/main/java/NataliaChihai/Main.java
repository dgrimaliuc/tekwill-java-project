package main.java.NataliaChihai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int suma= a+b;
        int dif= a-b;
        int prod=a*b;
        int cat= a/b;
        System.out.println(suma);
        System.out.println(dif);
        System.out.println(prod);
        System.out.println(cat);
        int min= a;
        if (b<a){
            min=b;
        }
        System.out.println("the lowest value is "+ min);

        Scanner scanner = new Scanner(System.in); // creează un obiect Scanner

        System.out.print("Enter your age: ");
        int varsta = scanner.nextInt();
        if (varsta>=18){
            System.out.print("You're an adult");
        }
        else {
            System.out.print("You're minor");
        }
    }
}