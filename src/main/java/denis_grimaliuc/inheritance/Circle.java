package main.java.denis_grimaliuc.inheritance;

import main.java.denis_grimaliuc.interfaces.IShape;

public class Circle implements IShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
