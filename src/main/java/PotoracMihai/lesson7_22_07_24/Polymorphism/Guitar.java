package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism;

import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.Interfaces.Playable;

public class Guitar implements Playable {


    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}
