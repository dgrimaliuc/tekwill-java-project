package main.java.daniel_sontu.Inheritance;

// adună două numere întregi
public class Calculator {

    // două numere întregi
    public static int add(int a, int b) {
        return a + b;
    }

    // două numere cu virgulă mobilă
    public static double add(double a, double b) {
        return a + b;
    }

    // un număr întreg cu un număr cu virgulă mobilă
    public static double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(100, 200.4));
    }
}
