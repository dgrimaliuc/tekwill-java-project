package LiubovZapsa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Toyota");

        System.out.println(cars);
        cars.add(0, "Mers");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}



