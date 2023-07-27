package alexei_drujinin.Encapsulation;

public class CarMain {

    public static void main(String[] args) {
        Car myObj = new Car("Honda","Accord",2018);
        System.out.println("Selected car is "+ myObj.getBrand()+" "+myObj.getModel()+" "+myObj.getYear());
    }
}
