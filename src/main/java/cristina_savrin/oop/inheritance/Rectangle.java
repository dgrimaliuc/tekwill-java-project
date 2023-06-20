package cristina_savrin.oop.inheritance;

/**
 * Design a subclass called "Rectangle" that inherits from "Shape" and includes additional instance variables such as width and height.
 */
public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
