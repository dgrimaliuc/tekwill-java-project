package alina_gutsul.abstractClasses;

import java.util.Random;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public static Triangle createRandomTriangle() {
        Random random = new Random();
        double base = random.nextDouble() * 10 + 1;  // Random base between 1 and 11
        double height = random.nextDouble() * 10 + 1;  // Random height between 1 and 11
        return new Triangle(base, height);
    }
}

public class MainArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(3);
        Triangle triangle = Triangle.createRandomTriangle();

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}