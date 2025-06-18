package main.java.daniel_sontu.Inheritance;

public class Shape {
    protected String color;
    protected boolean filled;

    // Constructor cu parametri
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Constructor implicit (opțional, în caz că alte clase au nevoie)
    public Shape() {
        this.color = "black";
        this.filled = false;
    }

    public double calculateArea() {
        return 0;
    }

    // Optional: getter methods (dacă vrei să accesezi color/filled din alte clase)
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}



//    private String color;
//    private boolean filled;
//
//    public Shape(String color, boolean filled) {
//        this.color = color;
//        this.filled = filled;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public double getPerimeter() {
//        return 0; // Override in subclasses like Rectangle
//    }

