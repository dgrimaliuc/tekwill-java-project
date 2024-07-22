package VictorMurashev.lesson_20240722_oop_polimorth;

public class Truck extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The truck's engine starts with a rumble.");
    }
}