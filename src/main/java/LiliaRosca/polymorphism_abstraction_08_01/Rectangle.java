package main.java.LiliaRosca.polymorphism_abstraction_08_01;

public class Rectangle implements Shape {
    private double width;
    public double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }
}
