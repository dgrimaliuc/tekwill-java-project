package main.java.denis_grimaliuc.inheritance;

import main.java.denis_grimaliuc.interfaces.IShape;

public class Triangle implements IShape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
