package AnastasiaGoncear.Lesson5AnastasiaGoncear;

/* Define a class called Book:
        •	Add instance variables: title, author, price, and isbn.
Create Constructors for the Book Class:
        •	Create a parameterized constructor that initializes the instance variables with the provided values.
Implement Methods for the Book Class:
        •	Create a method displayDetails() that prints the title, author, price, and isbn of the book.
        •	Create a method applyDiscount(double percentage) that reduces the price by the given percentage and prints the new price.*/
public class Book {
    String title;
    String author;
    double price;
    String isbn;

    Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = title;
        this.price = price;
        this.isbn = isbn;

    }

    public void displayDetails() {
        System.out.println(title + " " + title + " " + price + " " + isbn);
    }

    public double applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage.");
        }
        double Discount = price * (percentage / 100);
        price -= Discount;
        System.out.println("New price after " + percentage + "% discount: $" + price);
        return Discount;
    }
}
