package IngaTitchiev._HW_17_07;

public class Books {
    private String title;
    private String author;
    private double price;
    private String isbn;

    public Books(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: lei " + price);
        System.out.println("ISBN: " + isbn);
    }

    public void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage.");
            return;
        }
        price -= price * (percentage / 100);
        System.out.println("New Price after " + percentage + "% discount: $" + price);
    }

}
