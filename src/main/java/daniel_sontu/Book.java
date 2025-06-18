package main.java.daniel_sontu;

public class Book {

    String title;
    String author;
    int year;
    double price;

    @Override
    public String toString() {
        return "Book" +
                " title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", year = " + year +
                ", price = " + price +
                '\n';
    }

    Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }


//        void printinfo() {
//            System.out.println("Title is " + title);
//            System.out.println("Author is " + author);
//            System.out.println("Year is " + year);
//            System.out.println("Price is " + price);
//            System.out.println("Have a good read! ^_^");
//
//        }
    }

