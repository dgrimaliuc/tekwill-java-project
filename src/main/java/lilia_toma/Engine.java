package main.java.lilia_toma;

public class Engine {
    int speed;

    Engine() {
        speed = 0;
    }

    void start() {
        speed = 10;
        System.out.println("Enfine started with speed: " + speed);
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

//    void main() {
//        class Bank {
//            private Double balance;
//        }
//
//        public void setBalance (Double newBalance){
//            this.balance = newBalance
//        }






