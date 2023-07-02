package Leas_Liudmila.polymorphism;

public class VehicleMain {
    public static void main (String[] args){
        Car car = new Car();
        car.startEngine();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        Bus bus = new Bus();
        bus.startEngine();
    }
}
