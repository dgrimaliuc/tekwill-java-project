package main.java.LiliaRosca;

public class LR_Book {
    // HW 20.12 1. Creează o clasă numită Book cu variabile de instanță precum titlu, autor, an și preț. Creati constructorii.
// Creati in Main 2 obiecte ale clasei Book. Creati print info si afisati informatia despre obiecte in Main.
    String titlu;
    String autor;
    int an;
    double pret;

    LR_Book(String title, String author, int year, double price) {
        titlu = title;
        autor = author;
        an = year;
        pret = price;
    }

    public void printInfoB() {
        System.out.println("Tiltu: " + titlu);
        System.out.println("Autorul: " + autor);
        System.out.println("Anul: " + an);
        System.out.println("Pretul: " + pret);
    }
}