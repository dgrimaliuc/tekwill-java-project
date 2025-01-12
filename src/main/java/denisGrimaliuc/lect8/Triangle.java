package main.java.denisGrimaliuc.lect8;

public class Triangle implements Shape {
    double side;
    double height;

    Triangle(String color, boolean filled, double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * side * height;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}
