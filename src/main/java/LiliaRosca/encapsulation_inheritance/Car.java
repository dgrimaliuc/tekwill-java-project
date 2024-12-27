package main.java.LiliaRosca.encapsulation_inheritance;

public class Car extends Vehicle {
    int doors;
    String fuelType;

    Car(String brand, String colour, int year, int doors, String fuelType) {
        super(brand, colour, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", fuelType='" + fuelType + '\'' +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }
}