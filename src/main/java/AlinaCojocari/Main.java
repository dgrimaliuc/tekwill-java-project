package main.java.AlinaCojocari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Operatii cu variabile
        int a = 10;
        int b = 4;
        int suma = a + b;
        int diferenta = a - b;
        int produsul = a * b;
        double catul = (double) a / b;
        System.out.println("Suma: " + suma);
        System.out.println("Diferenta: " + diferenta);
        System.out.println("Produsul: " + produsul);
        System.out.println("Catul: " + catul);
        if (a < b) {
            System.out.println("Cel mai mic numar este: " + a);
        } else if (b < a) {
            System.out.println("Cel mai mic numar este: " + b);
        } else {
            System.out.println("Numerele sunt egale");
        }
        // 2. Verificare varsta
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();
        if (varsta >= 18) {
            System.out.println("Sunteti major.");
        } else {
            System.out.println("Nu suntei major.");
        }
    }
}
