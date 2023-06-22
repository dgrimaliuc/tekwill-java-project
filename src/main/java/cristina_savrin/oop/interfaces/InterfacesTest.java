package cristina_savrin.oop.interfaces;

public class InterfacesTest {

    public static void main(String[] args) {

        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Anna Karenina", "Leo Tolstoy", 350);
        printableItems[1] = new Book("War & Peace", "Leo Tolstoy", 500);
        printableItems[2] = new Magazine("National Geographic", "Lathkill Street Market Harborough Leicestershire LE16 9EF", "National Geographic Partners, LLC");
        printableItems[3] = new Magazine("Cosmopolitan", "Hearst Tower, 300 West 57th Street", "Hearst Corporation");

        for (Printable p : printableItems) {
            p.print();
        }
    }
}