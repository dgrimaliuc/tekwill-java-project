package ChirilBortnicov.Inheritance;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Leo", 2, "Woof", "Rottweiler", 37.4);
        dog.printInfo();
        Rectalge rectalge = new Rectalge("Red", "Yellow", "Blue", 25, 45);
        rectalge.printInfo();
        rectalge.setColor2("White");
        rectalge.setWidth(50);
        rectalge.printInfo();
    }
}
