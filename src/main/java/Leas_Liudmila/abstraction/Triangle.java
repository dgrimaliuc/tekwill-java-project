package Leas_Liudmila.abstraction;

public class Triangle extends Shape1 {
    private double a;
    private double b;
    private double c;
    private double s;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calculateSemiPerimeter();
    }

    @Override
    public double calculateArea() {
        if (triangleExists() == true) {
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            return 0;
        }

    }

    private double calculateSemiPerimeter() {
        s = (a + b + c) / 2;
        return s;
    }

    public boolean triangleExists() {
        return a + b > c && a + c > b && b + c > a;
    }


}
