package MarcencoAndrei;

// 2.  Create a class named “Shape” with instance variables for color. Design a subclass called
// “Rectangle” that inherits from “Shape” and includes additional instance variables such as width and height.
public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle stats = new Rectangle("Red", 13, 11);
        System.out.println(stats.color);
        System.out.println(stats.width);
        System.out.println(stats.height);
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
