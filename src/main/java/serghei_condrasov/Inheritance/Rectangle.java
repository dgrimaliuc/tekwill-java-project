package serghei_condrasov.Inheritance;

public class Rectangle extends Shape {

    /*Inheritance
    3. Design a subclass called "Rectangle" that inherits from "Shape"
    and includes additional instance variables such as width and height.*/

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
