package main.java.Magda_Petrachi.mostenire;

public class MP_calculator {
    public static void add(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        add(5, 10);
        System.out.println(sum(20, 4));
        System.out.println(sum(4, 4.5));
        System.out.println(sum(40.54, 20.12));
        System.out.println(sum(30.11, 99));
    }
}
