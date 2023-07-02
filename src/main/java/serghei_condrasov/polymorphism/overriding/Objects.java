package serghei_condrasov.polymorphism.overriding;

public class Objects {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano = new Piano();
        piano.play();

        Violin violin = new Violin();
        violin.play();

        Car car = new Car();
        car.startEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();

        Bus bus = new Bus();
        bus.startEngine();
    }
}
