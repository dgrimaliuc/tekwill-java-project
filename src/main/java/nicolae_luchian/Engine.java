package main.java.nicolae_luchian;

public class Engine {

    int speed;

    static String type = "V6";

    public void start() {
        speed = 10;
        System.out.println("Engine started");
    }
    public void stop() {
        if (Math.random() > 0.5) {
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine failed to stop");
        }
    }

    public Engine() {
        speed = 0;
    }

    public void accelerate() {
        if (speed < 100) {
            speed += 10;
            System.out.println("Accelerating");
        } else {
            System.out.println("Already at max speed");
        }
    }
}
