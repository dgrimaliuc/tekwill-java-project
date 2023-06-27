package anna_gontari.Inheritance;
//Create a class named "Shape" with instance variables for color. Design a subclass called "Rectangle" that inherits from
// "Shape" and includes additional instance variables such as width and height.
public class Rectangle extends Shape {
    int width;
    int height;
    public Rectangle (int width, int height) {
        super("black");
        this.height = height;
        this.width = width;
    }
    Rectangle (String color) {
        super(color);
        this.height = height;
        this.width = width;
    }
}
