package anna_gontari.AbstractClasses;

public class TestingShapes {
    public static void main(String[] args) {
        Circle Circle = new Circle(12);
        System.out.println(Circle.calculateArea());
        Rectangle Rectangle = new Rectangle(5, 6);
        System.out.println(Rectangle.calculateArea());
    }
}
