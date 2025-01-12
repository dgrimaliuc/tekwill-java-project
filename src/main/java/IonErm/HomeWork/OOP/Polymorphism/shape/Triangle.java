package main.java.IonErm.HomeWork.OOP.Polymorphism.shape;

public class Triangle extends Shape {
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
}
