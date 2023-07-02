package cristina_savrin.oop.polymorphism.overriding;

/**
 * 2. Implement a class called "Vehicle" with a method named "startEngine".
 * Create subclasses like "Car", "Motorcycle", and "Bus" that override the "startEngine" method to display different engine start messages.
 */
public class Bus extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Bus engine started.");
    }
}
