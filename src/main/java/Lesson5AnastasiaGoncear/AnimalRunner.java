package Lesson5AnastasiaGoncear;

public class AnimalRunner {
    public static void main(String[] args) {
    Animal animal=new Animal("Flufy", "dog", 10, "gav-gav" );
        Animal animal2=new Animal("Goldy", "cat", 5, "meau" );
    animal.makeSound();
    animal.displayInfo();
        animal2.makeSound();
        animal2.displayInfo();
}
}

