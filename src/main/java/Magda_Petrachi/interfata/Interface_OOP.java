package main.java.Magda_Petrachi.interfata;

public class Interface_OOP {
    public static void main(String[] args) {
        System.out.println("Cartea sau revista este:");

        Printable[] items = new Printable[]{
                new Book("Fluturi", "Eminescu", 12.99),
                new Magazine("Vogue", "Nu știu")
        };

        for (Printable item : items) {
            item.print();
        }
    }
}
