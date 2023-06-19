package Leas_Liudmila.abstraction;

public class Circle extends Shape1 {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
