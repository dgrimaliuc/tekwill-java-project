package main.java.denis_grimaliuc;

public class Engine {

    int speed;

    Engine() {
        speed = 0;
    }

    void start() {
        speed = 10;
        System.out.println("Engine started with speed: " + speed);
    }

    void accelerate() {
        speed += 20;
        System.out.println("Engine accelerated to speed: " + speed);
    }

    void stop() {
        speed = 0;
        System.out.println("Engine stopped. Current speed: " + speed);
    }
}
