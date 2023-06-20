package Leas_Liudmila.abstraction;

public class Shape1Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(25.6, 85.4);
        Circle circle = new Circle(25.5);
        Triangle triangle = new Triangle(Math.random() * (100 + 1), Math.random() * (100 + 1), Math.random() * (100 + 1));


        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
        if (triangle.triangleExists() == true) {
            System.out.println(triangle.calculateArea());
        } else {
            System.out.println("Triangle doesn't exist");
        }


    }
}
