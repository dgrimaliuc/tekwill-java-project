package main.java.LiliaRosca.polymorphism_abstraction_08_01.HW;

// HW Ex 3
public class Circle extends Shape {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
