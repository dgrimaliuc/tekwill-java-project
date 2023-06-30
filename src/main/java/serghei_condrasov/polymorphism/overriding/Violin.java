package serghei_condrasov.polymorphism.overriding;

/*Implement a class hierarchy for different musical instruments,
such as "Instrument" as the superclass and subclasses like "Guitar", "Piano", and "Violin".
Include a method named "play" in each subclass that produces a specific sound for the instrument.*/

public class Violin extends Instrument{
    @Override
    public void play() {
        System.out.println("Violin is playing");
    }
}
