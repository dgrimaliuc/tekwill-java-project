package AnastasiaGoncear.Lesson5AnastasiaGoncear;


public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book("May Mask", "M.Mask", 100, "ISBN 978-0-06-112008-4");
        book.displayDetails();
        book.applyDiscount(20);
    }
}
