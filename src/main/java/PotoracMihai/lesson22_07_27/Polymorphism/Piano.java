package main.java.PotoracMihai.lesson22_07_27.Polymorphism;

import main.java.PotoracMihai.lesson22_07_27.Polymorphism.Interfaces.Playable;

public class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}
