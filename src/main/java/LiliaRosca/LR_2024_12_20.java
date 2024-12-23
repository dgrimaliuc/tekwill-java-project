package main.java.LiliaRosca;

public class LR_2024_12_20 {
    // 1.1 new method
    /* static void myMethod() {
            System.out.println("I just got executed!");
        }
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
// 1.2 method + parameter
        static void myMethod(String fName) {
            System.out.println(fName + " LastName");
        }
    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
// 1.3 method + 2 parameters
    static void myMethod(String fName, int age) {
        System.out.println(fName + " is " + age);
    }
    public static void main(String[] args) {
        myMethod("Liam", 5); // ordinea trebuie sa corespunda cu acea in care au fost declarate in method
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
// 1.4 method - returnarea rezultatului
    static int myMethod(int x) {
        return 5 + x; //doar returneaza, dar nu afiseaza nimic
    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));;
    }
// 1.5 method - afisarea rezultatului
    public static void sum(int x, int y) {
        System.out.println(x + y); //doar afiseaza, dar nu returneaza nimic
    }
    public static void main(String[] args) {
        sum(3, 6);
    }
// 1.6 method - utilizarea rezultaului in alte functii
    public static int sum(int x, int y) {
        return (x + y);
    }
    public static void main(String[] args) {
        int sum1 = sum(5, 8);
        int sum2 = sum(sum1, 9);
        System.out.println(sum2);
    }

// 2.1 Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        checkAge(15); // call the checkAge method
    }
// Exercitii clasa
// Ex 1. metoda care primeste un numar intreg ca input si returneaza "par" / "impar"
    public static String isPar(int num) {
        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
    public static void main(String[] args) {
        System.out.println(isPar(8));
        System.out.println(isPar(11));
        System.out.println(isPar(0));
    }
// Ex 2. metoda greet - primeste numele unei persoane si afiseaza mesaj de salutare
    public static void greet(String name) {
        System.out.println("Hello, " + name + " !");
    }
    public static void main(String[] args) {
        greet("people");
        greet("falks");
    }
// Ex 3. Method that calculates average - var 1
    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 121, 58, 5, 4};
        var average = calculateAverage(numbers);
        System.out.println(average);
    }
// Ex 3. Method that calculates average - var 2
    public static double calculateAverage(int... numbers) { // ... in loc de []
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) { // fara definirea Array
        var average = calculateAverage(1, 2, 3, 4, 5, 6, 7, 121, 58, 5, 4);
        System.out.println(average);
    }
// de sine statator
// Ex 4. metodă - doi întregi ca parametri și returnează diferența lor, afiseaza difirenta in terminal.
    public static int diference(int a, int b) {
        return a - b; // ceva nu e bine
    }
    public static void main(String[] args) {
        System.out.println(diference(158, 35));
    }
// + Ex 5. metodă - trei întregi ca parametri și returnează maximum dintre cele trei.
    public static int maxim(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println(maxim(5, -9, 8));
    }
// + Ex 6. metoda - argumente tip integer si returneaza suma tuturor argumentelor.
    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        var s = sum(1, 2, 3, 4, 5, 6, 7, 121, 58, 5, 4);
        System.out.println(s);
    }
// + Ex 7. metoda "printNumbers" - un numar intreg ca parametru, afiseaza toate numerele de la 1 pina la cel primit.
    static void number(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("Count: " + i);
        }
    }
    public static void main(String[] args) {
        number(10);
    }*/

    // OOP - din clasa Main_LR ---------------------------------------------------------------
    /*    public static void main(String[] args) {
            Main_LR myObj = new Main_LR(); // Obiect 1 - accesare o data
            Main_LR myObj2 = new Main_LR(); // Obiect 2 - accesare de 2 ori
            Main_LR myObj3 = new Main_LR(); // Obiect 3 - accesare o data
            System.out.println(myObj.x);  // accesare o data
            System.out.println(myObj2.x);  // accesare de 2 ori
            System.out.println(myObj3.y);  // accesare o data
    // modificarea valorii existente fara a modifica accesarile anterioare myObj2 va ramine cu valoarea din clasa Main_LR
            myObj.x = 15; // acum x este 40, daca x nu ar avea valoare ar fi setarea acesteea
            System.out.println(myObj.x);
    // apelarea la mai multe atribute
            System.out.println("Name: " + myObj.fname + " " + myObj.lname + ", age: " + myObj.age);
    // Exercitii clasa
            Person_LR person1 = new Person_LR();
            Person_LR person2 = new Person_LR();
            Person_LR person3 = new Person_LR();// creaza 3 obiecte ale clasei Person_LR
            person1.printInfo();
            person2.printInfo();
            person3.printInfo(); // afiseaza obiectele
        }
    public static void main(String[] args) {
        // constructor cu parametrii
        Person_LR person11 = new Person_LR("David", "Ricardo", 102);
        Person_LR person12 = new Person_LR("Dave", "Rich", 101);
        person11.printInfo();
        person12.printInfo();
    }
*/
// HW 20.12 1. Creează o clasă numită Book cu variabile de instanță precum titlu, autor, an și preț. Creati constructorii.
// Creati in Main 2 obiecte ale clasei Book. Creati print info and afisati informatia despre obiecte in Main.
// LR_Book + Main_LR

// HW 2. Definește o clasă  Student cu variabile de instanță - nume, vârstă, notă și studentID. Creati constructorii.
// Creati in Main 2 obiecte ale clasei Student. Creati print info and afisati informatia despre obiecte in Main.
// LR_Student + Main_LR
}