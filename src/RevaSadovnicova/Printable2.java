package RevaSadovnicova;

import java.util.ArrayList;

public interface Printable2 {
    void print();
}

class Book2 implements Printable2{
    private String name;
    private String author;
    private Float price;

    public Book2(String name, String author, Float price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return name + " " + author + " " + price;
    }

    public void print() {
        System.out.println(this);
    }
    public void print2() {
        System.out.println(this);
    }
}

class Magazine2 implements Printable2{
    private String name;
    private String owner;

    public Magazine2(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String toString() {
        return name + " " + owner;
    }

    public void print() {
        System.out.println(this);
    }
}

class Printable2Demo {
    public static void demoArrayOfPrintable(){
        ArrayList<Printable2> bb = new ArrayList<>();
        bb.add(new Book2("B1", "A1", 0.1f));
        bb.add(new Magazine2("M1", "Me"));
        bb.add(new Magazine2("M2", "Me"));
        bb.add(new Magazine2("M3", "Someone"));
        bb.add(new Book2("B3", "A2", 0.2f));
        bb.add(new Book2("B2", "A1", 1000f));


        for (var a: bb){
            a.print();
        }
    }
}
