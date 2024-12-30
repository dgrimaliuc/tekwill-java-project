package main.java.IonErm.HomeWork.OOP.Inheritance;

public class Rectangle extends Shape {
    public double height;
    public double width;

    public Rectangle(String color, String state, double height, double width) {
        super(color, state);
        this.height = height;
        this.width = width;
    }

}
