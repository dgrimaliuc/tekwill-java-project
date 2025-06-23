package main.java.denis_grimaliuc.inheritance;


/**
 * Creați o clasă numită „Vehicle” cu variabile de instanță pentru marcă, culoare și an.
 * Proiectați o subclasă numită „Car” care moștenește de la „Vehicle” și include variabile de instanță suplimentare,
 * cum ar fi numărul de uși și tipul de combustibil.
 */


/**
 * Creează o clasă “Vehicle” cu o metodă startEngine
 * și subclasele “Car”, “Motorcycle” și “Truck” care suprascriu această metodă cu sunete specifice.
 */
public abstract class Vehicle {
    public String brand;
    public String color;
    public String year;

    public Vehicle(String brand, String color, String year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public abstract void startEngine();

    public abstract void stopEngine();
}
