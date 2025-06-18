package main.java.daniel_sontu.Inheritance;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
