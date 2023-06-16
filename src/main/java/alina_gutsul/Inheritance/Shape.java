package alina_gutsul.Inheritance;

public class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter method
    public String getColor() {
        return color;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

