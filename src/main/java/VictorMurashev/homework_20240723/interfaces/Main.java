package VictorMurashev.homework_20240723.interfaces;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Book("Harry Potter", "Joan Rowling", 28.99),
                new Magazine("Radio Time", "Joker")
        };

        for(Printable printable : printables){
            printable.print();
        }
    }
}
