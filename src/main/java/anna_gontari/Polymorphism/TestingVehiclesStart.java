package anna_gontari.Polymorphism;

public class TestingVehiclesStart {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        Cars cars = new Cars();
        Motorcycles motorcycles = new Motorcycles();
        Buses buses = new Buses();

        vehicles.startEngine();
        cars.startEngine();
        motorcycles.startEngine();
        buses.startEngine();
    }
}
