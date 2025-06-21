package main.java.daniel_sontu;

import main.java.daniel_sontu.Interface.Playable;

public class Drums implements Playable {
    @Override
    public void play() {
        System.out.println("Drums playing BA-DUM-TSS! ");
    }
}
