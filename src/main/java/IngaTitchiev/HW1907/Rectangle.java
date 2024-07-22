package IngaTitchiev.HW1907;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color); // Call the constructor of the superclass (Shape)
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

   @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Width: " + width+" cm");
        System.out.println("Height: " + height+ " cm");
        System.out.println("Area: " + calculateArea()+" cm^2");
    }

    public static void main(String[] args) {
        Shape shape = new Shape("Red");
        shape.printDetails();

        Rectangle rectangle = new Rectangle("Blue", 7.0, 11.0);
        rectangle.printDetails();
    }
}

