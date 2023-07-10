package oleg_tabanski;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Generate a random number between 0 and 100.
        Random rand = new Random();
        long randomNumber = Math.round(Math.random() * 100) + 10;
        System.out.println(randomNumber);


    }
}
