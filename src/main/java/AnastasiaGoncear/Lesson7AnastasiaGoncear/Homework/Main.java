package AnastasiaGoncear.Lesson7AnastasiaGoncear.Homework;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Book("Java Programming", "John Doe", 29.99),
                new Magazine("Tech Today", "Jane Smith"),
                new Book("Effective Java", "Joshua Bloch", 45.50),
                new Magazine("Fashion Forward", "Anna Wintour")
        };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}