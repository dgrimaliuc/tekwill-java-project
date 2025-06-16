package main.java.daniel_sontu;
import main.java.daniel_sontu.Inheritance.Circle;
import main.java.daniel_sontu.Inheritance.Shape;
import main.java.daniel_sontu.Inheritance.Square;
import main.java.daniel_sontu.Inheritance.Triangle;

import java.util.List;

public class MainOOP {

    public static void main(String[] args) {


        List<Shape> shapes = List.of(
                new Circle (5.9),
                new Square(10),
                new Triangle(5, 7)
                );

        for(Shape shape : shapes){
            System.out.println("Shape" +shape.getClass().getSimpleName()+ "Area: " +shape.calculateArea());
        }
    }
}


