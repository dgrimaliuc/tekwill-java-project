package Leas_Liudmila.Encapsulation;

public class CarMain {
    public static void main(String[] args){
        Car myCar= new Car();

        myCar.setMake("Mercedes");
        myCar.setModel("E300");
        myCar.setYear(2012);

        System.out.println(myCar.getMake() + " " + myCar.getModel() + " " + myCar.getYear());
    }
}
