package ana_raetcaia;

public class PrintableTest {
    public static void main (String[]args){
        Printable[] array = new Printable[2];
        array[0] = new Book("Alice in Wonderland","Lewis Carroll",20);
        array[1] = new Magazine("Vogue", "One World Trade Center","Arthur Baldwin Turnure");

        for (Printable item : array) {
            item.print();
        }

    }
}
