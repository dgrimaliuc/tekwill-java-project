package Leas_Liudmila.abstraction;

public class Rectangle extends Shape1 {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}
