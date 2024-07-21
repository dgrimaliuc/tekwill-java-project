package SergheiRubailo.Task10.inheritance;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
