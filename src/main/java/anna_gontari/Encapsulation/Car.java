package anna_gontari.Encapsulation;

public class Car {
    //Design a class called "Car" with private instance variables for make, model, and year.
    // Provide getter and setter methods for each variable.

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake () {
        return make;
    }
        public void setMake (String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
