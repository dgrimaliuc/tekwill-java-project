package alina_gutsul.overriding;

class Vehicle {
    public void startEngine() {
        System.out.println("Starting the vehicle's engine");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine");
    }
}

class Bus extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the bus's engine");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();

        Vehicle car = new Car();
        car.startEngine();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();

        Vehicle bus = new Bus();
        bus.startEngine();
    }
}

