package main.java.daniel_sontu;

import main.java.daniel_sontu.Interface.Playable;

public class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Guitar is playing: Strum strum!");
    }
}
