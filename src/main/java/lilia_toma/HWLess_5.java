package main.java.lilia_toma;

public class HWLess_5 {

//    static int add5(int x) {
//        return x + 5;
//    }
//
//    public static void main(String[] args) {
//        var summ = add5(10);
//
//        System.out.println("Sum is: " + summ);
//
//    }
//}
//----------------
//    static int add5(int x) {
//        return x + 5;
//    }
//
//    static int summ(int x, int y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println();
//        var num1 = add5(10);
//        var result = summ(num1, 20);
//
//        System.out.println("Result: " + result);
//    }
//}
//----------------------
//    static int add5(int x) {
//        return x + 5;
//    }
//
//    static void checkAge(int age) {
//        if (age < 18) {
//            System.out.println("You are unde 18 years old.");
//        } else {
//            System.out.println("You are 18 years old or older.");
//        }
//    }
//
//    public static void main(String[] args) {
/// /        checkAge(20);
/// /        checkAge(10);
/// /        checkAge(0);
/// /        checkAge(1);
/// /        checkAge(50);
//
//        /**sau alta modalitate de verificare a varstelor la psvm*/
//        int[] ages = {10, 20, 30, 40, 50};
//
//        for (int age : ages) {
//            checkAge(age);
//        }
//    }
//}

/**
 * 2. Scrie o metoda Java numita "greet" care primeste numele unei
 * persoane ca paarametru si afiseaza un mesaj de salut in consola,
 * cum ar fi "Hello, [nume]!"*
 */

//    static void greet(String name) {
//        System.out.println("Hello, " + name + "!");
//    }
//
//    public static void main(String[] args) {
//        greet("Denis");
//    }
//}

/**
 * 3. Scrie o metoda Java numita "calculateAverage" care primeste
 * un array de inumere intregi ca parametru si returneaza
 * media numerelor din array.
 *
 * @param number
 * @return
 */
//    static double calculateAverage(int[] numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return (double) sum / numbers.length;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5, 55, 11, 22, 33, 44, 11, 66};
//        var result = calculateAverage(arr);
//        System.out.println("Media numerelor este: " + result);
//    }
//}

/**
 * cum lucreaza argumentele sau "..."
 */
//    static double calculateAverage(int... numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return (double) sum / numbers.length;
//    }
//
//    public static void main(String[] args) {
//        var result = calculateAverage(1, 2, 3, 4, 5, 55, 11, 22, 33, 44, 11, 66);
//
//        System.out.println("Media numerelor este: " + result);
//    }
//}

/**
 * ex.1. Scrie o metoda Java numita "greet" care afiseaza un mesaj de
 * salut in consola, cum ar fi "Hello, World!"
 */
//    static void greet(String name) {
//        System.out.println("Hello, " + name + "!");
//    }
//
//    public static void main(String[] args) {
//        greet("World");
//    }
//}

/**
 * ex.2. Scrie o metoda care primeste doi intregi ca parametri
 * si returneaza diferenta lor. (-)
 */
//    static int add5(int x) {
//        return x - 25;
//    }
//
//    static int substraction(int x, int y) {
//        return x - y;
//    }
//
//    public static void main(String[] args) {
//        System.out.println();
//        var num1 = add5(50);
//        var result = substraction(num1, 20);
//
//        System.out.println("Result: " + result);
//    }
//}

/**
 * Creeaza o metoda care acepta trei intregi ca parametri
 * si returneaza maximul dintre cele trei.
 */
//    static int max(int i, int i1, int i2) {
//        return Math.max(i, Math.max(i1, i2));
//    }
//
//    public static void main(String[] args) {
//        int result = max(50, 25, 90);
//        System.out.println("Maximul este: " + result);
//    }
//}

/**
 * creeaza o metoda care va accepta argumente de
 * tip integer si va returna suma tuturor.
 */
//    static int add5(int x) {
//        return x + 5;
//    }
//
//    static int summ(int x, int y, int z) {
//        return x + y + z;
//    }
//
//    public static void main(String[] args) {
//        System.out.println();
//        var num1 = add5(10);
//        var num2 = add5(40);
//        var result = summ(num1, num2, 20);
//
//        System.out.println("Result: " + result);
//    }
}


