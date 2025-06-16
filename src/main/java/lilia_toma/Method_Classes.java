package main.java.lilia_toma;

public class Method_Classes {

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
////        checkAge(20);
////        checkAge(10);
////        checkAge(0);
////        checkAge(1);
////        checkAge(50);
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
//}
//---------------------------------

    /**
     * Exercitii OOP.
     * ex.1 Creeaza o clasa "Person" cu 3 campuri:
     * - firstName = "Adam"
     * - lastName = "Smith"
     * - age = 32
     * ex.2 Creeaza 3 obiecte ale clasei Person.
     * ex.3 Creeaza o metoda prinInfo in interiorul clasei.
     * ex.4 Afiseaza toate obiectele.
     */
//    public static void main(String[] args) {

//        Person person = new Person();
//        person.printInfo(); //expresia de legatura cu metoda din Person
////        System.out.println("First Name: " + person.firstName);
////        System.out.println("Last Name: " + person.lastName);
////        System.out.println("Age: " + person.age); // copiate in clasa Person
//    }
//}

////alt exemplu
//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//        person2.firstName = "John";
//        person2.lastName = "Doe";
//        person2.age = 25;
//
//        System.out.println("Person 1");
//        person1.printInfo();
//        System.out.println("\nPerson 2");
//        person2.printInfo();
//
//        person3.firstName = "Alice";
//        person3.lastName = "Johnson";
//        person3.age = 30;
//        System.out.println("\nPerson 3");
//        person3.printInfo();
//    }
//}
    /// /--------constructori----------
//        Person person1 = new Person("Denis", "Grimaliuc", 26);
//        Person person2 = new Person("Iurii", "Smith", 35);
//
//        person1.prinInfo();
//        person2.prinInfo();
//    }
//}

    /**
     * ex.1 Creeaza o clasa numita Book cu variabile de instanta
     * precum titlul, autor, an si pret.
     */ //variabilele au fost create in clasa Book,
    //aici cream obiectul
//    public static void main(String[] args) {
//        Book book1 = new Book("1984", "George Orwell", 1949, 15.99);
//        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.99);
//        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 12.99);
//
////        System.out.println(book1);
////        System.out.println(book2);
////        System.out.println(book3);
//
//        book1.printInfo();
//        book2.printInfo();
//        book3.printInfo();
//    }
//}

    /**
     * ex.2 Defineste o clasa numita Student cu variabile de instanta cum
     * ar fi nume, varsta, nota si studentID.
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.printInfo();
    }
}







