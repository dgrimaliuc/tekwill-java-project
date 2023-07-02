package ana_raetcaia;

public class Car {
    //Encapsulation
    //1. Design a class called "Car" with private instance variables for make, model, and year.
    // Provide getter and setter methods for each variable.
    private String brand;
    //I named this variable brand, I don't understand what is meaning (make) in this task
    private String model;
    private int  year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand( ){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }


}
