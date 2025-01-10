package main.java.georgeVinaga.Learn_08_01_2025.ClassWork;

// Overloading
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum +i;
        }
        return sum;
    }
}
