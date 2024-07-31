package ChirilBortnicov.Lesson2207.Overriding;

public class Truck extends Vehicle{

    public void startEngine(){
        System.out.println("Truck started");
    }

    @Override
    public String toString() {
        return "Truck{}";
    }
}
