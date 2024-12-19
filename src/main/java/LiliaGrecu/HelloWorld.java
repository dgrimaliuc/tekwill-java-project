package main.java.LiliaGrecu;

public class HelloWorld {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Număr pozitiv par");
            } else {
                System.out.println("Număr pozitiv impar");
            }
        } else if (num < 0) {
            System.out.println("Număr negativ");
        } else {
            System.out.println("Zero");
        }