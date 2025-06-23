package main.java.Magda_Petrachi.interfata;

public class Book implements Printable {
    String titlul;
    String autor;
    Double pret;

    public Book(String titlu, String autor, Double pret) {
        this.titlul = titlu;
        this.autor = autor;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Carte: '" + titlul + "', Autor: " + autor + ", Preț: " + pret + " lei";
    }
}
