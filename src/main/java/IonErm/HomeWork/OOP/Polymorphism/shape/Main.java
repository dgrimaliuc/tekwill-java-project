package main.java.IonErm.HomeWork.OOP.Polymorphism.shape;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(12, 23);
        Shape square = new Square(12);
        Shape circle = new Circle(34);

        System.out.println(triangle.calculateArea());
        System.out.println(square.calculateArea());
        System.out.println(circle.calculateArea());

        
    }
}
