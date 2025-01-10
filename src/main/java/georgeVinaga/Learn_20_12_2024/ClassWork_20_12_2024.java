package main.java.georgeVinaga.Learn_20_12_2024;

// Vom vorbi despre 1.Metode, 2.Clase, 3.Obiecte, 4.this

//--------------------------------------------------------------------------------
//1. Metode
public class ClassWork_20_12_2024 {
//        static void myMethod() {
//            System.out.println("I just get executed!");
//}
//    public static void main(String[] args) {
//        myMethod();
//        myMethod();
//        myMethod();
//    }
//}
//--------------------------------------------------------------------------------
// Parametrii metodei
//public class ClassWork_20_12_2024 {
//    static void myMethod(String fname) {
//        System.out.println(fname +" Refsnes");
//    }
//    public static void main(String[] args) {
//        myMethod("Liam");
//        myMethod("Jenny");
//        myMethod("Anja");
//    }
//}
//--------------------------------------------------------------------------------
// Câțiva parametri
//public class ClassWork_20_12_2024 {
//    static void myMethod(String fname, int age) {
//        System.out.println(fname + " is " + age);
//    }
//    public static void main(String[] args) {
//        myMethod("Liam", 5);
//        myMethod("Jenny", 8);
//        myMethod("Anja", 31);
//    }
//}
//--------------------------------------------------------------------------------
// Returnează rezultatul metodei.
//public class ClassWork_20_12_2024 {
//    static int myMethod(int x) {
//        return 5 + x;
//    }
//    public static void main(String[] args) {
//        System.out.println(myMethod(3));
//    }
//}
//--------------------------------------------------------------------------------

//public class ClassWork_20_12_2024 {
//    public static void sum(int a, int b) {
//        System.out.println(a + b);
//    }
//    public static void main(String[] args) {
//        sum(3, 3);
//    }
//}

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//    public static void main(String[] args) {
//        int sum1 = sum(3, 3);
//        int sum2 = (sum1 + 4);
//        System.out.println(sum2);
//    }
//}

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//    public static void main(String[] args) {
//        int sum1 = sum(3, 3);
//        int sum2 = (sum1 + 4);
//        System.out.println(sum2);
//    }
//}

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//    public static void main(String[] args) {
//        int sum = sum(2, 3);
//        System.out.println(sum); // returnează suma a doi parametri ai metodei
//    }
//}

    //    public static int sum(int a, int b) {
//        return a + b;
//    }
//    public static void main(String[] args) {
//        int z = sum(5, 3); // salveaza rezultatul într-o variabilă.
//        System.out.println(z);
//    }
//}
//--------------------------------------------------------------------------------
//    // O metoda cu if și else
//    static void checkAge(int age) { // Creaza o metoda checkAge, cu un integer ce cheamă age.
//        if (age < 18) { // Daca age este mai mic de 18, accesul este interzis
//            System.out.println("Accesul este interzis - Tu nu ai virsta necesara");
//        } else { // Daca age este mai mare sau egal cu 18, accesul este acceptat
//            System.out.println("Accesul este acceptat - Tu ai virsta necesara");
//        }
//    }
//
//    public static void main(String[] args) {
//        checkAge(20); // apelați metoda checkAge și transmiteții lui vârsta de 20 de ani.
//    }
//}
//--------------------------------------------------------------------------------
// Scrie o metodă care primește un numbar intreg ca input și returnează „Par” dacă numărul este par și „Impar” dacă este impar.
//    public static String isPar(int number) {
//        if (number % 2 == 0) {
//            return "Par";
//        } else {
//            return "Impar";
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(isPar(5));
//        System.out.println(isPar(6));
//        System.out.println(isPar(0));
//    }
//}
//--------------------------------------------------------------------------------
// Scrie o metodă Java numită „greet” care primește numele unei persoane ca parametru și afișează un mesaj de salut în consolă, cum ar fi „Hello, [nume]!”
//    public static void greet(String name) {
//        System.out.println("Hello, " + name + "!");
//    }
//    public static void main(String[] args) {
//        greet("Denis");
//        greet("Michel");
//    }
//}
//--------------------------------------------------------------------------------
// Scrie o metodă Java numită „calculateAverage” care primește un array de întregi ca parametru și returnează media numerică din array.
//    public static double caleculateAverage(int[] numbers) {
//        double sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum / numbers.length;
//    }
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 4, 1, 3, 4, 1, 3, 4, 1};
//        var average = caleculateAverage(numbers);
//        System.out.println(average);
//    }

    // Sau o metoda mai usoara
    public static double caleculateAverage(int... numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        var average = caleculateAverage(1, 2, 3, 4, 5, 4, 1, 3, 4, 1, 3, 4, 1);
        System.out.println(average);
    }
}
//--------------------------------------------------------------------------------
// Scrie o metodă care primește doi întregi ca parametri și returnează diferența lor. (-). Afiseaza difirenta in terminal.

//--------------------------------------------------------------------------------

