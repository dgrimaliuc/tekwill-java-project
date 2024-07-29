package SergheiRubailo.Task11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle truck = new Truck();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(truck);

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }

        Display display = new Display();

        display.show(1);
        display.show(2.0);
        display.show("Test!");

        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano = new Piano();
        piano.play();

        Drums drums = new Drums();
        drums.play();
    }


}
