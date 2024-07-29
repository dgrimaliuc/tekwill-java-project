package AnastasiaGoncear.Lesson7AnastasiaGoncear.PolimorfismOverride;
//Create a Vehicle class with a startEngine method and
// subclasses Car, Motorcycle, and Truck that override it with specific sounds.
public class Main {
    public static void main(String[] args) {
        Vehicle Car = new Car();
        Vehicle Motocycle = new Motocycle();
        Vehicle Truck = new Truck();

        Car.startEngine();
        Motocycle.startEngine();
        Truck.startEngine();
    }
}