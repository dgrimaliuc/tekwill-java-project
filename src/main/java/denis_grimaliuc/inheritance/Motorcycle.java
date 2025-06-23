package main.java.denis_grimaliuc.inheritance;

public class Motorcycle extends Vehicle {


    public Motorcycle(String brand, String color, String year) {
        super(brand, color, year);
    }


    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a revving sound.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The motorcycle's engine stops with a gentle rumble.");
    }
}
