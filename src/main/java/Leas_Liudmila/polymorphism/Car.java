package Leas_Liudmila.polymorphism;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car: Quiet engine start");
    }
}
