package MarcencoAndrei;

//  Create a class named “Shape” with instance variables for color. Design a subclass called “Rectangle”
//  that inherits from “Shape” and includes additional instance variables such as width and height.
public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
