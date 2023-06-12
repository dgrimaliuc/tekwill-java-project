package denis_grimaliuc;

import java.util.Random;

public class Main2 {
/*

Write a method that takes two integers as parameters and returns the maximum of the two.
 */


    public static void main(String[] args) {
        int score = 100;
        Random random = new Random();
        int newRandom = random.nextInt(100);
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A".strip());
                break;
            case 8:
                System.out.println("B");
                break;
            default:
                System.out.println("D");
        }
    }


}
