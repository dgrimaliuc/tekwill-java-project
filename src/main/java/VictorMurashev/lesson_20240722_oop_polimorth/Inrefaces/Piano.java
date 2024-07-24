package VictorMurashev.lesson_20240722_oop_polimorth.Inrefaces;

public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano.");
    }
}
