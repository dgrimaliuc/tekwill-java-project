package IgorTabirta.Les_July19.Inheritance.HW;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(width);
        System.out.println(height);
    }
}
