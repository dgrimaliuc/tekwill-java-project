package alexei_drujinin.Polymorphism;

public class VechicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        vehicle.startEngine();
        car.startEngine();
        motorcycle.startEngine();
        bus.startEngine();
    }
}
