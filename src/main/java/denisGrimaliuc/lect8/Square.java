package main.java.denisGrimaliuc.lect8;

public class Square implements Shape {
    private double side;

    Square(String color, boolean filled, double side) {
        this.side = side;
    }

    public void print() {
        System.out.println("Side: " + side);
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
