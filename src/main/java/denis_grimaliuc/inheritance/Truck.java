package main.java.denis_grimaliuc.inheritance;

public class Truck extends Vehicle {
    public Truck(String brand, String color, String year) {
        super(brand, color, year);
    }


    @Override
    public void startEngine() {
        System.out.println("The truck's engine starts with a deep rumble.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The truck's engine stops with a heavy thud.");
    }
}
