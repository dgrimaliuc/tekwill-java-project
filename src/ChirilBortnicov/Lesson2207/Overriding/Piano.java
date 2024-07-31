package ChirilBortnicov.Lesson2207.Overriding;

public class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}
