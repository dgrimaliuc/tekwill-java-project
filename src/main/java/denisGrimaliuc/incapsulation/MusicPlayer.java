package main.java.denisGrimaliuc.incapsulation;


/**
 * Creează o clasă MusicPlayer cu variabile precum: „currentSong”, „volume” și metode: playSong(String song), addVolume() și reduceVolume():
 * <p>
 * •	playSong(String newSong) – ar trebui să seteze currentSong la valoarea noului song
 * •	addVolume() – ar trebui să adauge 15 la volum
 * •	reduceVolume() – ar trebui să scadă 15 din volum
 */
public class MusicPlayer extends Object {
    String currentSong;
    int volume;

    public void playSong(String newSong) {
        currentSong = newSong;
    }

    public void addVolume() {
        volume += 15;
    }

    public void reduceVolume() {
        volume -= 15;
    }
}
