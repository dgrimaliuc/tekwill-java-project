package VictorMurashev.lesson_20240722_oop_polimorth.Inrefaces;

public class Main {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        Playable drums = new Drums();

        guitar.play();
        piano.play();
        drums.play();
    }
}
