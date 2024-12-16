package main.java.georgeVinaga;

import java.util.Scanner;

public class ClassWork_13_Dec_2024 {
    public static void main(String[] args) {
//--------------------------------------------------------------------
        /*
        int age = 18;
        if (age >= 18) {
            System.out.println("Ești adult.");
        } else {
            System.out.println("Ești minor.");
        }
        */
//--------------------------------------------------------------------
        /*
        int num = 10;
        if (num > 0)
            if (num % 2 == 0) {
                System.out.println("Număr pozitiv par");
            } else {
                System.out.println("Număr pozitiv impar");
            }
        else if (num < 0) {
            System.out.println("Număr negativ");
        } else {
            System.out.println("Zero");
        }
        */
//--------------------------------------------------------------------
        /*
        // Găsește suma a două numere
        int a = 2;
        int b = 4;
        int sum = a + b;
        System.out.println(sum);
        */
//--------------------------------------------------------------------
        /*
        // Verifică daca un numar este pozitiv, negativ sau zero
        int number = 0;
        if (number > 0) {
            System.out.println("Num is more then 0");
        } else if (number < 0) {
            System.out.println("Num is less than 0");
        } else {
            System.out.println("Num is 0");
        }
        */
//--------------------------------------------------------------------
        /*
        // Verifică daca numaru este par sau impar
        int number = 1;
        if (number % 2 == 0) {
            System.out.println("Num is par");
        } else {
            System.out.println("Num is impar");
        }
        */
//--------------------------------------------------------------------
        /*
        // Verifică dacă un număr este divizibil cu 2 și 3.
        int number = 1;
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("Num is divisible by 2 and 3");
        } else {
            System.out.println("Num is not divisible by 2 and 3");
        }
        */
//--------------------------------------------------------------------
        // Citește un șir de caractere de la utilizator și afișează lungimea acestuia
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String lenght is: " + str.length());
         */
//--------------------------------------------------------------------
//         Îndeplinește următoarea sarcina
//        2. Verificare vârstă:
//         • Folosind Scanner, solicitați utilizatorului să introducă vârsta sa.
//         • Dacă numărul este mai mare sau egal cu 18, afișați mesajul: “Sunteți major”.
//         • În caz contrar, afișați mesajul: “Nu sunteți major”.

        Scanner scanner = new Scanner(System.in); // Crează un obiect Scanner
        System.out.println("Scrie ce vârstă ai: ");
        int myAge = scanner.nextInt(); // Citețte vârsta care o scriso utilizatorul

        // Verifică dacă utilizatorul este major sau minor
        if (myAge >= 18) {
            System.out.println("Sunteți major.");
        } else {
            System.out.println("Nu sunteți major.");
        }


    }
}
