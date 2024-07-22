package VictorMurashev.homework_20240718;

class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;
    private String isbn;

    // Parameterized constructor
    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    // Method to print book details
    public void displayDetails() {
        System.out.println("====Information about book====");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("ISBN: " + isbn);
        System.out.println("\n");
   }

    // Method to calculate discount
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
        System.out.println("=====returning new price====");
        System.out.println("New Price: " + price);
        System.out.println("\n");
    }
}