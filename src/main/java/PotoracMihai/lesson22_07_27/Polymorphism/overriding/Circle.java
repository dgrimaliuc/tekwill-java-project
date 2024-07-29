package main.java.PotoracMihai.lesson22_07_27.Polymorphism.overriding;

import main.java.PotoracMihai.lesson22_07_27.Polymorphism.Interfaces.IShape;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
