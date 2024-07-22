package ChirilBortnicov.Lesson2207.Overriding;

public class Motorcycle extends Vehicle{

    public void startEngine(){
        System.out.println("Motorcycle started");
    }

    @Override
    public String toString() {
        return "Motorcycle{}";
    }
}
