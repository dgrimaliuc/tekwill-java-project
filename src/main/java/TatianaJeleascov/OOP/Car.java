package main.java.TatianaJeleascov.OOP;

class Car {
    private String make;
    private String model;
    private int yearOfModel;

    public Car(String make, String model, int yearOfModel) {
        this.make = make;
        this.model = model;
        this.yearOfModel = yearOfModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }
}
