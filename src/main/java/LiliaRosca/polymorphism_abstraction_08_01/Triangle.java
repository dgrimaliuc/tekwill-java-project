package main.java.LiliaRosca.polymorphism_abstraction_08_01;

public class Triangle implements Shape {
    double side;
    double height;

    Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * side * height;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}
