package main.java.alexandru_todos;

public class Car {
    // Create a class called ‘Car’ with private instance variables for model, year, etc.
    // Provide getter and setter methods for each variable

    private String model;
    private int year;
    private int kilometreage;

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public int getKilometreage() {
        return kilometreage;
    }

    public void setKilometreage(int newKilometreage) {
        this.kilometreage = newKilometreage;
    }
}
