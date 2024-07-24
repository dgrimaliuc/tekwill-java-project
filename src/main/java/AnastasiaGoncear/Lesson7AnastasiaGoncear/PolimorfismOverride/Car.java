package AnastasiaGoncear.Lesson7AnastasiaGoncear.PolimorfismOverride;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting with a rrrr!");
    }
}