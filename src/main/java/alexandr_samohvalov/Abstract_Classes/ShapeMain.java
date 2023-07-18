package alexandr_samohvalov.Abstract_Classes;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        Shape circle = new Circle(2.5);
        System.out.println("Circle Area: " + circle.calculateArea());

    }
}
