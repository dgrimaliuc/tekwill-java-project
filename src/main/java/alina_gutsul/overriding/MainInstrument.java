package alina_gutsul.overriding;

class Instrument {
    public void play() {
        System.out.println("Playing the instrument");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Strumming the guitar");
    }
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}

class Violin extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the violin");
    }
}

public class MainInstrument {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play();

        Instrument guitar = new Guitar();
        guitar.play();

        Instrument piano = new Piano();
        piano.play();

        Instrument violin = new Violin();
        violin.play();
    }
}
