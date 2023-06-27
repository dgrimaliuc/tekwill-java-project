package anna_gontari.Polymorphism;

public class TestingPrintable {
    public static void main(String[] args) {
        Printable[] array = new Printable[2];
        array[0] = new Book("War and peace V1.","Lev Tolstoi",152);
        array[1] = new Magazine("National Geographic", "Penguin Random House",50);

        for (Printable item : array) {
            item.print();
        }
    }
}
