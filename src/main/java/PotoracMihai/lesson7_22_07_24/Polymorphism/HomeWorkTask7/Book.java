package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.HomeWorkTask7;

import main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.HomeWorkTask7.Interface.Printable;

public class Book implements Printable, main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.Interfaces.Printable {

    private String name;
    private String author;

    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void print() {
        Printable.super.print();
    }
}
