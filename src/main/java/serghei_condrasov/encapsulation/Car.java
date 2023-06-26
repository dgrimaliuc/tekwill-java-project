package serghei_condrasov.encapsulation;

public class Car {

    /*Encapsulation
    1. Design a class called "Car" with private instance variables for make, model, and year.
    Provide getter and setter methods for each variable.*/

    private String brand;
    private String model;
    private Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
}
