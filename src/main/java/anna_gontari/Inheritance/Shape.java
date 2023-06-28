package anna_gontari.Inheritance;
//Create a class named "Shape" with instance variables for color. Design a subclass called "Rectangle" that inherits from
// "Shape" and includes additional instance variables such as width and height.
public class Shape {
    private String color;
    public Shape(String color) {
        setColor(color);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}