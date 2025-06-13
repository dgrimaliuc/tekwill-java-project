package main.java.denis_grimaliuc;

/**
 * Creează o clasă MusicPlayer cu variabile precum: „currentSong”, „volume”
 * și metode: playSong(String song), addVolume() și reduceVolume():
 * <p>
 * •	playSong(String newSong) – ar trebui să seteze currentSong la valoarea noului song
 * •	addVolume() – ar trebui să adauge 15 la volum
 * •	reduceVolume() – ar trebui să scadă 15 din volum
 */
public class MusicPlayer {
    String currentSong;
    int volume = 15;

    void playSong(String newSong) {
        this.currentSong = newSong;
        System.out.println("Now playing: " + currentSong);
    }

    void addVolume() {
        if (volume + 15 < 100) {
            volume += 15;
            System.out.println("Volume increased to: " + volume);
        } else {
            System.out.println("Volume is at maximum level.");
        }
    }

    void reduceVolume() {
        if (volume - 15 >= 0) {
            volume -= 15;
            System.out.println("Volume decreased to: " + volume);
        } else {
            System.out.println("Volume is at minimum level.");
        }
    }
}
