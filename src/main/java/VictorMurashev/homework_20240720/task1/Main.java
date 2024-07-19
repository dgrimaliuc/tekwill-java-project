package VictorMurashev.homework_20240720.task1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", "SX4", 2013);
        //Printing initial car details
        System.out.println(car);

        //Modifying car details
        car.setModel("S-Cross");
        car.setYear(2024);

        //Printing modified details
        System.out.println("====Printing modified car details====");
        System.out.println(car);

        //Trying to set invalid year to return valid error
        System.out.println("==== set invalid year to return an error====");
        car.setYear(1800);

    }
}
