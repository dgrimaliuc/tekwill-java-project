package main.java.PotoracMihai.task6_19_07_24.inheritance;

public class Car extends Vehicle {
    private int doorsnumber;

    private String fuelType;

    public Car(String brand, String color, int year, int doorsnumber, String fuelType) {
        super(brand, color, year);
        this.doorsnumber = doorsnumber;
        this.fuelType = fuelType;
    }

    public Car(String brand, String color, int year) {

        super(brand, color, year);

    }

}
