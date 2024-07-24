package VictorMurashev.homework_20240720.task4;

public class Rectangle extends Shape{
    private double width;
    private double height;

    //Constructor

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    //Getters and setters


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Method the calculate area
    public double getRectArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "color='" + getColor() + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", area=" + getRectArea() +
                '}';
    }
}
