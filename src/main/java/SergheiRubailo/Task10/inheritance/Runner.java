package SergheiRubailo.Task10.inheritance;

public class Runner {
    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 5, "wav-wav", "labrador", 50);
        System.out.println(dog.toString());

        Rectangle rectangle = new Rectangle("green", 12, 15);
        System.out.println(rectangle.toString());
    }
}
