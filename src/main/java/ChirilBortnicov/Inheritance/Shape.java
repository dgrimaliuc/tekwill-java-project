package main.java.ChirilBortnicov.Inheritance;

public class Shape {
    private String color;
    private String color2;
    private String color3;

    public Shape(String color, String color2, String color3) {
        this.color = color;
        this.color2 = color2;
        this.color3 = color3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getColor3() {
        return color3;
    }

    public void setColor3(String color3) {
        this.color3 = color3;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", color2='" + color2 + '\'' +
                ", color3='" + color3 + '\'' +
                '}';
    }
}
