package LiubovZapsa.lesson2207.Overriding;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }


    @Override
    public String toString() {
        return "Square{" + "side= " + side + "}";
    }
}
