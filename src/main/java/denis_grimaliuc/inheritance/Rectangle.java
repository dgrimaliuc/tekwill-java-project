package main.java.denis_grimaliuc.inheritance;


/**
 * Proiectați o subclasă numită „Rectangle” care moștenește de la „Shape” și include variabile
 * de instanță suplimentare, cum ar fi lățimea și înălțimea.
 */
public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }


}
