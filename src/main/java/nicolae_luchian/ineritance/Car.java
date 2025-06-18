package main.java.nicolae_luchian.ineritance;

public class Car extends Vehicle {

    public int numberOfDoors;

    public String fuelType;

    public Car() {
        super(name, year, type);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }
}
