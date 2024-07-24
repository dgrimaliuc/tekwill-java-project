package DenisGrimaliuc.task1907.inheritance;


/*
 Create a class called "Vehicle" with instance variables for brand, color, and year.
  Design a subclass called "Car" that inherits from
 "Vehicle" and includes additional instance variables such as number of doors and fuel type.


 */
public class Car extends Vehicle {
    private int doorsNumber;
    private String fuelType;

    public Car(String brand, String color, int year, int doorsNumber, String fuelType) {
        super(brand, color, year);
        this.doorsNumber = doorsNumber;
        this.fuelType = fuelType;
    }

    public void printInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
        System.out.println("Doors number: " + doorsNumber);
        System.out.println("Fuel type: " + fuelType);
    }
}
