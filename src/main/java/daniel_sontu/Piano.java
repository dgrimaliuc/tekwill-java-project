package main.java.daniel_sontu;

import main.java.daniel_sontu.Interface.Playable;

public class Piano implements Playable {
    
    @Override
    public void play(){
        System.out.println("Piano is playing: Tam Tam!");
    }
}
