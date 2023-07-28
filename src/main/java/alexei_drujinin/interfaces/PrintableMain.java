package alexei_drujinin.interfaces;


public class PrintableMain {

        public static void main(String[] args) {
            Printable[] array = new Printable[2];
            array[0] = new Book("Master i Margarita", "Mihail Bulgakov", 100);
            array[1] = new Magazine("Flowers for Algernon", "Daniel Kiz", 80);

            for (Printable item : array) {
                item.print();
            }
        }
    }

