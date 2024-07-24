package RevaSadovnicova.inheritance;

public class Car {
    private String model;
    private Integer year;
    private String make;

    public Car(String model, Integer year){
        this.model = model;
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake(){
        return make;
    }

    public void setMake( String make){
        this.make = make;
    }
}
