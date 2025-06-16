package main.java.denis_grimaliuc.inheritance;


/**
 * Proiectați o subclasă numită „Car” care moștenește de la „Vehicle” și include variabile de instanță suplimentare,
 * * cum ar fi numărul de uși și tipul de combustibil.
 */
public class Car extends Vehicle {

    public int numberOfDoors;
    public String fuelType;

    public Car(String brand, String color, String year, int numberOfDoors, String fuelType) {
        super(brand, color, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;

    }

    public Car() {
        super("Unknown", "Unknown", "Unknown");
        this.numberOfDoors = 0;
        this.fuelType = "Unknown";

    }

    @Override
    public String toString() {
        return "Car {" +
                "numberOfDoors=" + numberOfDoors +
                ", fuelType='" + fuelType + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                "}\n";
    }
}
