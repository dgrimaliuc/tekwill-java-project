package main.java.IonErm.Old;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Pat", "Arigo", 34);
//        person.printInfo();

        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997, 200.5);
        book1.printInfo();
        Book book2 = new Book("1984", "George Orwel", 1948, 123.34);
        book2.printInfo();

        Student student1 = new Student("Lili", 20, 91.2, 102);
        student1.printInfo();
        Student student2 = new Student("Rian", 24, 78.8, 128);
        student2.printInfo();
    }
}
