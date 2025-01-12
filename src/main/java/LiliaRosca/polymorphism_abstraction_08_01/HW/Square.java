package main.java.LiliaRosca.polymorphism_abstraction_08_01.HW;

// HW Ex 3
public class Square extends Shape {
    public double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
