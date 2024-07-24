package AnastasiaGoncear.Lesson7AnastasiaGoncear.PolimorfismOverride;

public class Motocycle  extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine is starting with a vvvvv!");
    }
}