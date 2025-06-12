package main.java.daniel_sontu;

import java.util.ArrayList;

public class CarListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mercedes");
        cars.add("Porsche");

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
