package VictorMurashev.lesson_20240722_oop_polimorth;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle truck = new Truck();

        car.startEngine();
        motorcycle.startEngine();
        truck.startEngine();
    }
}
