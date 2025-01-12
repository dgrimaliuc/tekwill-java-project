package main.java.LiliaRosca.polymorphism_abstraction_08_01;

public class Circle implements Shape {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
