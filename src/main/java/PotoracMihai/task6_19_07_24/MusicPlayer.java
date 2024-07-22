package main.java.PotoracMihai.task6_19_07_24;

public class MusicPlayer {
    String currentSong;

    int volume;

    void playSong(String song) {
        currentSong = song;
        System.out.println("Now playing: " + currentSong);
    }

    void addVolume() {
        volume += 15;
        System.out.println("Volume is now: " + volume);
    }

    void reduceVolume() {
        if (volume <= 15) {
            volume = 0;
        } else {
            volume -= 15;
        }
    }
}
