package LiubovZapsa.lesson2207.Overriding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(5, 10));
        shapes.add(new Circle(5));
        shapes.add(new Square(5));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area:" + shape.calculateArea());

        }


    }
}
