package main.java.denis_grimaliuc.inheritance;

import main.java.denis_grimaliuc.interfaces.IShape;

public class Square implements IShape {
    double side;

    public Square(double sideLength) {
        this.side = sideLength;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

}
