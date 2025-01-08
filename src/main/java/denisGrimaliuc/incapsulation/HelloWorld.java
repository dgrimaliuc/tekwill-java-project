package main.java.denisGrimaliuc.incapsulation;

public class HelloWorld {

    // Scrie o metodă care primește un numbar intreg ca input și returnează „Par” dacă numărul este par și „Impar” dacă este impar.
    public static String isPar(int number) {

        if (number % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }

    }

    // Scrie o metodă Java numită „greet” care primește numele unei persoane ca parametru și afișează un mesaj de salut în consolă, cum ar fi „Hello, [nume]!”

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Scrie o metodă Java numită „calculateAverage” care primește un array de întregi ca parametru și returnează media numerelor din array.
    public static double calculateAverage(int... numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }


    public static void main(String[] args) {
        var average = calculateAverage(1, 2, 3, 4, 5, 6, 7, 3, 1, 3, 4, 5, 6, 3, 1, 4, 5, 76, 4, 3, 2);
        System.out.println(average);
    }
}
