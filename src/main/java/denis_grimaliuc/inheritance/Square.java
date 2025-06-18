package main.java.denis_grimaliuc.inheritance;

public class Square extends Shape {
    double side;

    public Square(double sideLength) {
        this.side = sideLength;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

}
