package SergheiRubailo.Task8;

public class Runner {
    public static void main(String[] args) {
        Animal dog = new Animal("Rex", "dog", 4, "gav-gav");
        dog.makeSound();
        dog.displayInfo();

        Animal cat = new Animal("Alice", "cat", 9, "meau-meau");
        cat.makeSound();
        cat.displayInfo();

        Book book1 = new Book("Hobbit", "Tolkien", 100, "123123123");
        book1.displayDetails();
        book1.applyDiscount(20);
    }
}
