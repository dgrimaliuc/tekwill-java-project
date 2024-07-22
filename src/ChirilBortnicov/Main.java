package ChirilBortnicov;

import ChirilBortnicov.Lesson2207.Overriding.*;

import java.io.StringWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       //Create a Vehicle class with a startEngine method and subclasses Car, Motorcycle,
        // and Truck that override it with specific sounds.
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle truck = new Truck();
        car.startEngine();
        motorcycle.startEngine();
        truck.startEngine();

        Piano piano = new Piano();
        piano.play();
        Guitar guitar = new Guitar();
        guitar.play();
        Drums drums = new Drums();
        drums.play();
    }

}

