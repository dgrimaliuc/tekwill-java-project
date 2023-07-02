package anna_gontari.Polymorphism;

public class TestingInstruments {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        instrument.plays();
        guitar.plays();
        piano.plays();
        violin.plays();
    }
}
