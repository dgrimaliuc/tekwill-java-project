package LiubovZapsa.Inheritance;

public class Car extends Vehicle {
    private int doorsNumbers;
    private String fuelType;

    public Car(String brand, String color, int year, int doorsNumbers, String fuelType) {
        super(brand, color, year);
        this.doorsNumbers = doorsNumbers;
        this.fuelType = fuelType;
    }

    public void printInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
        System.out.println("Doors Number: " + doorsNumbers);
        System.out.println("Fuel Type: " + fuelType);


    }
}
