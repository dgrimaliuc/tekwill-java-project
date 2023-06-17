package Leas_Liudmila.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red", 45, 70);
        System.out.println("Your rectangle is " + rectangle.getColor() + " with width " + rectangle.getWidth() + " and height " + rectangle.getHeight());

    }
}
