package cristina_savrin.oop.polymorphism.overriding;

public class OverridingTest {

    public static void main(String[] args) {

        Instrument musicalInstrument = new Instrument();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        musicalInstrument.play();
        guitar.play();
        piano.play();
        violin.play();

        System.out.println();

        Car car = new Car();
        Motorcycle moto = new Motorcycle();
        Bus bus = new Bus();

        car.startEngine();
        moto.startEngine();
        bus.startEngine();
    }
}
