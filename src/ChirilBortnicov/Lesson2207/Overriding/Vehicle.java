package ChirilBortnicov.Lesson2207.Overriding;

public abstract class Vehicle {
    //Create a Vehicle class with a startEngine method and subclasses Car, Motorcycle,
    // and Truck that override it with specific sounds.
    public abstract void startEngine();

    @Override
    public String toString() {
        return "Vehicle{}";
    }
}
