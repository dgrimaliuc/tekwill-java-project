package main.java.ChirilBortnicov.ChirilBortnicov1707;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        person.printInfo();

        Fruits fruits = new Fruits("Mango", "Red", 150);
        System.out.println(fruits);

        Book book = new Book("Crime and consequences",
                "Fedor Dostoevsky", 1866, 999);
        System.out.println(book);


    }
}
