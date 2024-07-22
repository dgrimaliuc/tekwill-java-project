package VictorMurashev.homework_20240720.task1;

import java.time.Year;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        int currentYear = Year.now().getValue();
        if (year > 1885 && year <= currentYear) { // Simple validation for a plausible car manufacturing year
            this.year = year;
        } else {
            System.out.println("Please enter a valid year.");
        }
    }

    @Override
    public String toString() {
        return "Car {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
