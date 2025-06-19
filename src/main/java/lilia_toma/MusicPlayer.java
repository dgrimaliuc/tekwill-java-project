package main.java.lilia_toma;

/**
 * Creeaza o clasa MusicPlayer cu variabile precum: "currentSong", "volume"
 * si metode: playSong(String song), addVolume() si reduceColum():
 * playSong(String newSong) - ar trebui sa seteze currentSong la valoarea noului song
 * addVolume() - ar trebui sa adauge 15 la volum
 * reduceVolume() - ar trebui sa scada 15 din volum
 */
public class MusicPlayer {
    String currentSong;
    int volume = 15;

    void playSong(String newSong) {
        this.currentSong = newSong;
        System.out.println("Now playng: " + currentSong);
    }

    void addVolume() {
        if (volume + 15 < 100) {
            volume += 15;
            System.out.println("Volume increased to: " + volume);
        } else {
            System.out.println("Volume is at maximum level.");
        }
    }

    void reduceVolum() {
        if (volume - 15 >= 0) {
            volume -= 15;
            System.out.println("Volume decreased to: " + volume);
        } else {
            System.out.println("Volume is at minimum level.");
        }
    }
}
