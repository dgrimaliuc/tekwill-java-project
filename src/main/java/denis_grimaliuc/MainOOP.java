package main.java.denis_grimaliuc;

public class MainOOP {

    static int add5(int x) {
        return x + 5;
    }

    static int summ(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are under 18 years old.");
        } else {
            System.out.println("You are 18 years old or older.");
        }
    }


    /**
     * Scrie o metodă care primește un număr int ca parametru și
     * returnează „Par” dacă numărul este par
     * și „Impar” dacă este impar.
     *
     * @param number
     * @return
     */

    static String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    /**
     * Scrie o metodă care primește un nume ca parametru și
     * afișează un mesaj de salut personalizat.
     *
     * @param name
     */
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * Scrie o metodă care primește un număr și returnează
     * pătratul acestuia.
     *
     * @param number
     * @return
     */
    static double calculateAverage(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;

    }


    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 1949, 15.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 12.99);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
