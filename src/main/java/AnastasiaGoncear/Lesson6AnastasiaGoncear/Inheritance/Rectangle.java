package AnastasiaGoncear.Lesson6AnastasiaGoncear.Inheritance;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);

        this.width = width;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("Color " + getColor());
        System.out.println("Width " + width);
        System.out.println("Height " + height);

    }
}
