package main.java.denisGrimaliuc.lect8;

public class Circle implements Shape {
    public double radius;


    Circle(String color, boolean filled, double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

  
}
