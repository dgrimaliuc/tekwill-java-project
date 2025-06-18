package main.java.liliana_stavita;

public class musicplayermainopp {


    public static void main(String[] args) {

    MusicPlayer player = new MusicPlayer();
        player.playSong("SONG 1");
        player.playSong("SONG 2");

        player.addVolume();
        player.addVolume();
        player.addVolume();
        player.addVolume();

    player.playSong("SONG 3");

    player.reduceVolume();
    player.reduceVolume();


    }
}