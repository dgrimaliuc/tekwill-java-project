package AnastasiaGoncear.Lesson7AnastasiaGoncear.PolimorfismOverride;

public class Truck extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The truck's engine is starting with a drdrrrddrrd!");
    }
}