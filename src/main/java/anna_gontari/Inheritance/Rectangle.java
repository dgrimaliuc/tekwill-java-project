package anna_gontari.Inheritance;
//Create a class named "Shape" with instance variables for color. Design a subclass called "Rectangle" that inherits from
// "Shape" and includes additional instance variables such as width and height.
public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(String color, int width, int height){
        super(color);
        setWidth(width);
        setHeight(height);
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