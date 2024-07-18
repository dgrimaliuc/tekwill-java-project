package IngaTitchiev._HW_17_07;

public class Runner {
    public static void main(String[] args) {
        Animals cat = new Animals("Whiskers", "Cat", 2, "Meow");
        Animals dog = new Animals("Buddy", "Dog", 3, "Gav-Gav");
        Animals cow = new Animals("Bessie", "Cow", 4, "Muuu");
        System.out.println("Display info about first animal");
        cat.displayInfo();
        cat.makeSound();

        System.out.println();
        System.out.println("Display info about second animal");
        dog.displayInfo();
        dog.makeSound();

        System.out.println();
        System.out.println("Display info about third animal");
        cow.displayInfo();
        cow.makeSound();

        Books book = new Books("Amintiri din copilarie", "Ion Creanga", 30.00, "978-1234685995");

       book.displayDetails();

        System.out.println();

        book.applyDiscount(15); // Applying a 10% discount
        book.displayDetails();


    }
}
