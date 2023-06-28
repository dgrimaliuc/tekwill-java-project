package alexandr_samohvalov.Encapsulation;
// Design a class called "Car" with private instance variables for make, model, and year. Provide getter and setter methods for each variable.
public class Cars {
    private String make ;
    private String model ;
    private int year ;
        public String getMake () {
            return make;
        }
        public void setMake(String newMake) {

            this.make = newMake;
        }
    public String getModel () {

            return model;
    }
    public void setModel(String newModel) {

            this.model = newModel;
    }
    public int getYear () {

            return year;
    }
    public void setYear(Integer newYear) {
        this.year = newYear;
    }


}
