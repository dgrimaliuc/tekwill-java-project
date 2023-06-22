package cristina_savrin.oop.abstraction;

/**
 * 1. Create an abstract class called "Shape" with an abstract method named "calculateArea".
 * Create two subclasses of Shape, such as "Rectangle" and "Circle", and implement the "calculateArea" method differently in each subclass.
 */
public class Rectangle extends Shape {

    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}