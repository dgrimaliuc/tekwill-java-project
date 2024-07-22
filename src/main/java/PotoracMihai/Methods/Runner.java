package main.java.PotoracMihai.Methods;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printInfo();
        Student student2 = new Student();
        student2.fname = "Jane";
        student2.lname = "Doe";
        student2.age = 21;
        student2.printInfo();
        Student student3 = new Student();
        student3.fname = "John";
        student3.lname = "Smith";
        student3.age = 22;
        student3.printInfo();

        Fruit fruit = new Fruit("Apple", "Red", 52);
        System.out.println(fruit.name);

        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 20.2, 010123132);
        book.displayDetails();
        book.applyDiscount(10);


        Book book2 = new Book("Harry Potter", "J.K. Rowling", 15.5, 010123132);
        book2.displayDetails();
        book2.applyDiscount(15);


        Animal animal = new Animal("Dog", "mammal", 5, "Bark");
        animal.makeSound();
        animal.displayInfo();
        Animal animal2 = new Animal("Cat", "mammal", 3, "Meow");
        animal2.makeSound();
        animal2.displayInfo();
        Animal animal3 = new Animal("Parrot", "bird", 2, "Chirp");
        animal3.makeSound();
        animal3.displayInfo();


    }
}
