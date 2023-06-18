package ana_raetcaia;

public class Rectangle extends Shape {
    //3.  Create a class named "Shape" with instance variables for color. Design a subclass called "Rectangle"
    // that inherits from "Shape" and includes additional instance variables such as width and height.
    int width;
    int height;

    Rectangle(int width, int height, String color){
        super (color);
        this.width = width;
        this.height = height;
    }

   public static void main (String[]args){
        Rectangle rectangleObj = new Rectangle(4,54, "red");

       System.out.println(rectangleObj.width + " : " + rectangleObj.height + " : " + rectangleObj.color);
    }
}
