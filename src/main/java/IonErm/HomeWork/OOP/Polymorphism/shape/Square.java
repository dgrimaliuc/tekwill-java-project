package main.java.IonErm.HomeWork.OOP.Polymorphism.shape;

public class Square extends Shape {

    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
