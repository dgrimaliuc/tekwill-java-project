package main.java.denisGrimaliuc.lect8;


/*
    Proiectați o subclasă numită „Rectangle” care moștenește de la „Shape” și include variabile
 de instanță suplimentare, cum ar fi lățimea și înălțimea.
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public double calculateArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

}
