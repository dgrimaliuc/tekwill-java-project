package LiubovZapsa.lesson2207.Overriding;

public class Triangle extends Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * (side * height);
    }

    @Override
    public String toString() {
        return "Triangle{" + "side= " + side + "}" + ",height= " + height + "}";
    }


}
