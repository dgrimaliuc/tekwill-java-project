package main.java.LiliaRosca.polymorphism_abstraction_08_01.HW;

// HW Ex 3
public class Triangle extends Shape {
    public double side;
    public double height;

    Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * side * height;
    }
}
