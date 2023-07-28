package alexei_drujinin.Polymorphism;

public class InstrumentMain {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        instrument.play();
        guitar.play();
        piano.play();
        violin.play();
    }
}
