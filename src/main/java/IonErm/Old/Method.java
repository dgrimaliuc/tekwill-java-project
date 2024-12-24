package main.java.IonErm.Old;

public class Method {
    static void myMethod(String name) {
        System.out.println(name + " HHeeeeelouu!");
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static String numberPar(int number) {
        if (number % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    public static void greet(String name1) {
        System.out.println("Hello " + name1 + " u are great!");
    }

    public static double calculateAverage(int... numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    //    Scrie o metodă care primește doi întregi ca parametri și returnează diferența lor. (-)
//    Afiseaza difirenta in terminal.
    public static int diferenceNum(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        myMethod("Kyle");
        myMethod("Luk");
        myMethod("Op");

        checkAge(39);
        checkAge(17);

        System.out.println(numberPar(123));
        System.out.println(numberPar(24));
        System.out.println(numberPar(675));

        greet("Iulia");


        var average = calculateAverage(1, 234, 35, 345, 4, 645, 56756, 7, 435);
        System.out.println(average);

        System.out.println(diferenceNum(2, 21));
    }
}
