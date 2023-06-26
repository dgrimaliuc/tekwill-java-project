package roman_marcov.Encapsulation;

public class Car {

    //    1. Design a class called "Car" with private instance variables for make, model, and year.
    //    Provide getter and setter methods for each variable.
    private String model, make;
    private int year;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
