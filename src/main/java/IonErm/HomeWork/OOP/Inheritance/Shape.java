package main.java.IonErm.HomeWork.OOP.Inheritance;

public class Shape {
    private String color;
    private String state;

    public Shape(String color, String state) {
        this.color = color;
        this.state = state;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
