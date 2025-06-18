package main.java.daniel_sontu.Inheritance;

public class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
