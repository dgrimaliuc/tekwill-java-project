package VictorMurashev.lesson_20240722_oop_polimorth.Inrefaces;

public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar.");
    }
}
