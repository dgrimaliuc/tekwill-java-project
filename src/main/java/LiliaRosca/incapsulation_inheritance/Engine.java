package main.java.LiliaRosca.incapsulation_inheritance;

public class Engine {
    // Exercitii class 23.12 Ex 3
    int speed = 0;

    public void start() {
        speed = 10;
        System.out.println("Engine started. Current speed is " + speed);
    }

    public void accelerate() {
        speed += 20;
        System.out.println("Current speed is " + speed);
    }

    public void stop() {
        speed = 0;
        System.out.println("Engine stoppeed. Current speed is " + speed);
    }
}