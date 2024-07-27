package main.java.PotoracMihai.task7_22_07_24.Polymorphism.overriding;

import main.java.PotoracMihai.task7_22_07_24.Polymorphism.Interfaces.IShape;

public class Triangle implements IShape {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (side * height);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                '}';
    }
}
