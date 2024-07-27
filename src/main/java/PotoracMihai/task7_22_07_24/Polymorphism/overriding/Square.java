package main.java.PotoracMihai.task7_22_07_24.Polymorphism.overriding;

import main.java.PotoracMihai.task7_22_07_24.Polymorphism.Interfaces.IShape;

public class Square implements IShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
