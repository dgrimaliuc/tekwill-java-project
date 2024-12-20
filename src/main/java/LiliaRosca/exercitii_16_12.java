package main.java.LiliaRosca;

import java.util.Scanner;

public class exercitii_16_12 {
    public static void main(String[] args) {
        // old - class 11.12
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Intrody numele tau: ");
        String name = scanner.nextLine();
        System.out.println ("Buna, " + name + "!");

        String message = "Hello";
        int lung = message.length(); // lungimea variabilei message

// HW 11.12--------------------------------------------------------------
        // 2  Creati o clasa noua in folder personal cu metoda main
        int number = 1;
        double zecimale = 0.11;
        String caractere = "sir de caractere";
        boolean adevarat = true;
        System.out.println(number + " " + zecimale + " " + caractere + " " + adevarat);
        System.out.println(number);
        System.out.println(zecimale);
        System.out.println(caractere);
        System.out.println(adevarat);

// class 13.12---------------------------------------------
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);
        // adult
        int age = 18;
        if (age >= 18) {      // <=
            System.out.println("Esti adult.");
        } else { System.out.println("Esti minor.");
        }
        // voting prezentarea
        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) { System.out.println("Old enough to vote!");
        } else { System.out.println("Not old enough to vote.");
        }
        // nota prezentarea
        int score = 85;
        if (score >= 90) { System.out.println("Nota: A");
        } else if (score >= 80) { System.out.println("Nota: B");
        } else if (score >= 70) { System.out.println("Nota: C");
        } else { System.out.println("Nota: F");
        }

        int num = 10;
        if (num > 0) {
            if (num % 2 == 0) { System.out.println("Numar pozitiv par");
            } else { System.out.println("Numar pozitiv impar");
            }
        } else if (num < 0) { System.out.println("Numar negativ");
        } else { System.out.println("Zero");
        }
        // numar pozitiv, negativ sau zero
        int num = 0;
        if (num > 0) { System.out.println("Numar pozitiv");
        } else if (num < 0) { System.out.println("Numar negativ");
        } else { System.out.println("Zero");
        }
        // numar par sau impar
        int num = 1;
        if (num % 2 == 0) { System.out.println("Numar par");
        } else { System.out.println("Numar impar");
        }
        //numar divizibil cu 2 si 3
        int num = 6;
        if (num % 2 == 0 && num % 3 == 0) { System.out.println("Numar divizibil cu 2 si 3");
        } else { System.out.println("Numar nu este divizibil cu 2 si 3");
        }
        // citeste un sir de caractere de la utilizator si afiseaza lungimea acestuia
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String length is: " + str.length());

// 13.12 de sine statator class ---------------------------------
        // suma a doua numere (a + b)
        int num1 = 6;
        int num2 = 13;
        int sum = num1+ num2;
        System.out.println("Suma: " + sum);
        // verifica daca doua numere sunt egale (a == b)
        int num1 = 6;
        int num2 = 13;
        if (num1 == num2) { System.out.println("Numerele sunt egale");
        } else {  System.out.println("Numerele nu sunt egale");
        }
        // maxim intre 3 numere
        int a = 6;
        int b = 13;
        int c = 2;
        if (a >= b && a>= c){ System.out.println("Numarul maxim este: " + a);
        } else if (b >= a && b>= c) { System.out.println("Numarul maxim este: " + b);
        } else { System.out.println("Numarul maxim este: " + c);
        }
        // var 2
        int a = 6;
        int b = -5;
        int c = 2;
        int largest = Math.max(Math.max(a, b), c);
        System.out.println("Numar maxim " + largest);
// suplimentar verifica varsta folosind scanner: >= 18 - Sunteti major, < 18 - Nu sunteti major
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int str = sc.nextInt();
        if (str >= 18) { System.out.println("Sunteti major");
        } else { System.out.println("Nu sunteti major");
        }*/

// class 16_12  ciclu while ---------------------------------------------------
        /*int count = 1;
        while (count <= 100) {
            System.out.println("Count: " + count);
            count ++; // sau count = count + 1 si aici deja se poate de modificat pasu
        // numere pare pina la 50
        int count = 1;
        while (count <= 50){
            if (count % 2 == 0) { System.out.println(count);
            }
            count ++;
        // parola pina la corecta
        Scanner sc = new Scanner (System.in);
        String password = "aaaaa";
        String intrPassword;
        do { System.out.println("Introduceti parola: ");
            intrPassword = sc.nextLine();
            } while (!intrPassword.equals(password));

// 16.12 de sine statator-----------------------------------------------
        //numără de la 10 la 1 folosind  ciclu while
        int count = 10;
        while (count >= 1) { System.out.println(count);
            count--; // count = count - 1
            }
        // suma tuturor numerelor pare de la 0 la 50 folosind ciclu while
        int count = 1;
        int sum = 0;
        while (count <= 50){
            if (count % 2 == 0) {
                sum += count; //sum = sum + count;
            }
            count ++;
        }
        System.out.println(sum);

// ciclu for ---------------------------------------------
        for (int i = 1; i <= 5; i ++) {
            System.out.println("Count: " + i);
        }
        //numara de la 1 la 10
        for (int i = 1; i <= 10; i ++) { System.out.println(i);
        }
        //numara de la 10 la 1   decrementarea
        for (int i = 10; i >= 1; i --) { System.out.println(i);
        }
        // impare de la 10 la 30
        for (int i = 11; i <= 30; i += 2) // i = i + 2
            System.out.println(i);

        //tabela inmultirii pentru un numar
        int a = 8;
        for (int i = 0; i <=10; i ++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
        //suma tuturor numerelor impare de la 1 la 51 folosind o buclă for
        int sum = 0;
        for (int i = 11 ; i <= 51; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        // utilizatorul introduce o serie de note pina cind o nota negative este introdusa
        int number;
        Scanner sc = new Scanner(System.in);
        do { System.out.println("Enter a number: ");
            number = sc.nextInt();
            if (number < 0) {
                break;
            }
        } while (true);

        // numere pare de la 1 la 20 fara multiplii la 5
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) { // excludem numere impare
               continue;
            }
            if (i % 5 == 0) { // excludem miltiplii la 5
               continue;
            }
            System.out.println(i);
        }
// array -----------------------------------------------------------
        String[] cars = {"Volvo", "BMV", "Ford", "Mazda"};
        System.out.println(cars[0]); // numerare se incepe cu 0 - primul element Volvo

        // modificarea elementului din array - prezentarea
        String[] cars = {"Volvo", "BMV", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]); // primul element este Opel

        // afisarea numarului de elemente din array - prezentarea
        String[] cars = {"Volvo", "BMV", "Ford", "Mazda"};
        System.out.println(cars.length); // 4

        //afisarea elementelor din array - prezentarea
        String[] cars = {"Volvo", "BMV", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*
// for each loop --------------------------------------------------------
        // afisarea elementelor prin for each - prezentarea
        String[] cars = {"Volvo", "BMV", "Ford", "Mazda"};
        for (String i : cars) { System.out.println(i);
        }
        // suma elementelor din array
        int [] num = {1, 5, 8, 7, 9, 16};
        int sum = 0;
        for (int i : num) { sum += i;
        }
        System.out.println("Suma elementelor este: " + sum);

        // maxim din array
        int [] num = {1, 5, 8, 7, 9, 16, 584, 68, 78, 63};
        int max = num[0];
        for (int i : num) {
            if (i > max){ max = i;
            }
        }
        System.out.println("Maxim: " + max);

        // minim din array
        int [] num = {1, 5, 8, 7, 9, 16, 584, 68, 78, 63};
        int min = num[0];
        for (int i : num) {
            if (i < min){ min = i;
            }
        }
        System.out.println("Minim: " + min);
*/
        // media din array
        int [] num = {1, 5, 8, 7, -84, 16, 584, 68, 78, 63};
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println("Media: " + sum / num.length);
    }
}