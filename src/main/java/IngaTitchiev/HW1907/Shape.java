package IngaTitchiev.HW1907;

public class Shape {
    private String color;

   public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Color: " + color);
    }
}

