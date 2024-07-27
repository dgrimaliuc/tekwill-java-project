package main.java.PotoracMihai.task7_22_07_24.Polymorphism.overloading;


/*
Create a class called Calculator with overloaded methods for addition.
Implement methods that can add two integers, two floating-point numbers,
and an integer and a floating-point number.
*/
public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.5, 2.5));
        System.out.println(calculator.add(1, 2.5));

    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }
}
