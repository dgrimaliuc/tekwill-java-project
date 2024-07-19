package DenisGrimaliuc.task1907;


/*
        Create a MusicPlayerClass with variables like: ‘currentSong’, ‘volume’
        and methods: playSong(String song), addVolume() and reduceVolume()
        playSong(String newSong) - should set to current song the newSong value
        addVolume – should add to volume 15
        reduceVolume should reduce from volume 15

 */
public class MusicPlayer {
    static final int con = 5;
    String currentSong;
    int volume;

//    public static void main(String[] args) {
//        System.out.println(con);
//    }

    void playSong(String song) {
        currentSong = song;
    }

    void addVolume() {
        if (volume >= 85) {
            volume = 100;
        } else {
            volume += 15;
        }
    }

    void reduceVolume() {
        if (volume <= 15) {
            volume = 0;
        } else {
            volume -= 15;
        }
    }
}
