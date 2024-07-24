package VictorMurashev.lesson_20240722_oop_polimorth;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with a vroom-vroom-vroom.");
    }
}
