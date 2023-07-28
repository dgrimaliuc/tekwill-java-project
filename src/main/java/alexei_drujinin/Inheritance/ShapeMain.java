package alexei_drujinin.Inheritance;


public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("yellow", 10, 15);
        System.out.println("Your rectangle is " + rectangle.getColor() + " with width " + rectangle.getWidth() + " and height " + rectangle.getHeight());
    }
}
