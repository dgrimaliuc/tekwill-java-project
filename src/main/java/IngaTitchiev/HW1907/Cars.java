package IngaTitchiev.HW1907;

public class Cars {
    private String make;
    private String model;
    private int year;

   public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
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

        public int getYear() {
        return year;
    }

        public void setYear(int year) {
        this.year = year;
    }

     public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

   }

