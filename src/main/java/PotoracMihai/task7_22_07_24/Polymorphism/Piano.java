package main.java.PotoracMihai.task7_22_07_24.Polymorphism;

import main.java.PotoracMihai.task7_22_07_24.Polymorphism.Interfaces.Playable;

public class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}
