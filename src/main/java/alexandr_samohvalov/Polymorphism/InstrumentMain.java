package alexandr_samohvalov.Polymorphism;

public class InstrumentMain {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play();

        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano = new Piano();
        piano.play();

        Violin violin = new Violin();
        violin.play();
    }
}
