package ChirilBortnicov.Lesson2207.Overriding;

public class Car extends Vehicle{

    @Override
    public String toString() {
        return "Car{}";
    }

    public void startEngine(){
        System.out.println("Car started");
    }
}
