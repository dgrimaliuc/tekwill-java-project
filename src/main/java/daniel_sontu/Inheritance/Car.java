package main.java.daniel_sontu.Inheritance;

import main.java.daniel_sontu.Vehicle;

public class Car extends Vehicle {
    public int numberofDoors;

    public String fuelType;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Car(String brand, String color, String year, int numberofDoors, String fuelType){
        super(brand, color, year);
        this.numberofDoors = numberofDoors;
        this.fuelType = fuelType;
    }
    public Car(){
        super("Uknown", "Blue", "2000");
    }
}
