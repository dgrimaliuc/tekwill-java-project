package VictorMurashev.homework_20240718;

public class Main {
    public static void main(String[] args) {
        // Create an Animal object
        Animal myDog = new Animal("Buddy", "Dog", 5, "Woof Woof");
        // Calling Animal methods
        myDog.displayInfo();
        myDog.makeSound();

        // Create a Book object
        Book myBook = new Book("Java Programming", "John Doe", 39.99, "123-4567891234");
        // Calling Book methods
        myBook.displayDetails();
        myBook.applyDiscount(10); // Applying a 10% discount
    }
}

