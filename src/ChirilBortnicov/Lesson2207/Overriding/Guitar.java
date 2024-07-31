package ChirilBortnicov.Lesson2207.Overriding;

import java.sql.SQLOutput;

public class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}
