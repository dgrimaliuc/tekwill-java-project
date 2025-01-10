package main.java.denisGrimaliuc.inheritance;

/**
 * Proiectați o subclasă numită „Car” care moștenește de la „Vehicle” și include variabile de instanță suplimentare,
 * cum ar fi numărul de uși și tipul de combustibil.
 */
public class Car extends Vehicle {
    int doors;
    String fuelType;

    Car(String brand, String color, int year, int doors, String fuelType) {
        super(brand, color, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", fuelType='" + fuelType + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
