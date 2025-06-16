package main.java.denis_grimaliuc;

import main.java.denis_grimaliuc.inheritance.*;

import java.util.List;

public class MainOOP {


    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5.9),
                new Rectangle(4.5, 3.2),
                new Square(3.0),
                new Triangle(6.0, 4.0)
        );

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName() + ", Area: " + shape.calculateArea());
        }
    }
}
