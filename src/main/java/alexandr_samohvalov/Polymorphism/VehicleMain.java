package alexandr_samohvalov.Polymorphism;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        Car car = new Car();
        car.startEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();

        Bus bus = new Bus();
        bus.startEngine();
    }
}
