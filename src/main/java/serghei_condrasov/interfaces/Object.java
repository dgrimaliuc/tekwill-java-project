package serghei_condrasov.interfaces;

//Create an array of Printable objects containing both books and magazines and call the print() method for each item.

public class Object {
    public static void main(String[] args) {

        Book book = new Book("Master and Margarita", "Michael Bulgakov", 150);
        System.out.println(book.toString());

        Magazine magazine = new Magazine("Pitstop ", "Michael Doudson");
        System.out.println(magazine.toString());
    }
}
