package ChirilBortnicov.Lesson1907.Inheritance;

public class Car extends Vehicle{
    private int doorsNum;
    private String fuelType;

    public Car(String brand, String color, int year, int doorsNum, String fuelType){
        super(brand, color, year);
        this.doorsNum = doorsNum;
        this.fuelType = fuelType;


    }
}
