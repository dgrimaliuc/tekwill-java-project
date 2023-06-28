package alexandr_samohvalov.Inheritance;
// Create a class named "Shape" with instance variables for color.
// Design a subclass called "Rectangle" that inherits from "Shape" and includes additional instance variables such as width and height.
public class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }
    public  class Rectangle extends Shape {
        private int width;
        private int height;

        public Rectangle(String color, int width, int height) {
            super(color);
            this.width = width;
            this.height = height;
        }
    }
}
