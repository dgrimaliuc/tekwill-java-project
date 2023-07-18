package serghei_condrasov.polymorphism.overriding;

/*Implement a class called "Vehicle" with a method named "startEngine".
Create subclasses like "Car", "Motorcycle",
and "Bus" that override the "startEngine" method to display different engine start messages.*/

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car start engine activated");
    }
}
