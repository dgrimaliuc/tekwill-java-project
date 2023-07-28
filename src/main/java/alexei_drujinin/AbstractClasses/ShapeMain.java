package alexei_drujinin.AbstractClasses;


public class ShapeMain {
    public static void main(String[] args) {
        Circle Circle = new Circle(8);
        System.out.println(Circle.calculateArea());
        Rectangle Rectangle = new Rectangle(4, 8);
        System.out.println(Rectangle.calculateArea());
    }
}
