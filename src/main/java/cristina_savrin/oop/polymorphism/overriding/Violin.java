package cristina_savrin.oop.polymorphism.overriding;

/**
 * 1. Implement a class hierarchy for different musical instruments, such as "Instrument" as the superclass and subclasses like "Guitar", "Piano", and "Violin".
 * Include a method named "play" in each subclass that produces a specific sound for the instrument.
 */
public class Violin extends Instrument {
    @Override
    public void play() {
        System.out.println("The violin sound can be produced in two ways: by pulling a horsehair bow over one of the four strings, or by pulling the strings with your fingers.");
    }
}
