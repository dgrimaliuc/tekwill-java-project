package main.java.georgeVinaga.Learn_23_12_2024.HomeWork;

/*
 Creați o clasă numită „Shape” cu variabile de instanță pentru culoare și statutul de umplere.
  */
public class Shape {
    public String color;
    private boolean filled;

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public void print() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }
}
