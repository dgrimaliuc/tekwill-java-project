package main.java.PotoracMihai.lesson22_07_27.Polymorphism;

import main.java.PotoracMihai.lesson22_07_27.Polymorphism.Interfaces.Playable;

public class Guitar implements Playable {


    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}
