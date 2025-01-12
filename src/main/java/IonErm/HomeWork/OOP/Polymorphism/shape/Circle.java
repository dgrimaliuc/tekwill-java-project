package main.java.IonErm.HomeWork.OOP.Polymorphism.shape;

public class Circle extends Shape {
    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
