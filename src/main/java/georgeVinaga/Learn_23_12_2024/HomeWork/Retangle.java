package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;

/*
    Proiectați o subclasă numită „Rectangle” care moștenește de la „Shape” și include variabile
 de instanță suplimentare, cum ar fi lățimea și înălțimea.
 */
public class Retangle extends Shape {
    private double width;
    private double height;

    Retangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public void print() {
        super.print(); // Adica printeaza mai intii printurile din prima clasa Shape
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
