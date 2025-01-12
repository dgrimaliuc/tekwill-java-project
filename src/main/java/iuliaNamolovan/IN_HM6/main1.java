package main.java.iuliaNamolovan.IN_HM6;

public class main1 {
    public static void main(String[] args) {

        Book book1 = new Book("Titlu 1", "Autor1", 2020);
        Book book2 = new Book("Titlu 2", "Autor 2", 2023);
        System.out.println("Informatii despre cartea 1:");
        book1.printInfo();
        System.out.println("Informatii despre cartea 2:");
        book2.printInfo();
    }
}

