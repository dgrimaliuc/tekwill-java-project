package main.java.alexeiRata;

public class Conditions {
    public static void main(String[] args) {
//Exemplu 1
        int age = 18;
        if (age >= 18) {  //<=
            System.out.println("Esti adult.");
        } else {
            System.out.println("Esti minor.");
        }

//Exemplu 2
        int num = -11;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Numar pozitiv par");
            } else {
                System.out.println("Numar pozitiv impar");
            }
        } else if (num < 0) {
            System.out.println("Numar negativ");
        } else {
            System.out.println("Zero");
        }

// Additional cases
        int num1 = 1;
        int num2 = 9;
        int num3 = 9;

//Case 1 Gasim suma a doua numere
        System.out.println("Suma numerelor este: " + (num1 + num2));

//Case2 Verificam daca doua numere sunt egale
        if (num1 == num2) {
            System.out.println("Numerele sunt egale");
        } else {
            System.out.println("Numerele nu sunt egale");
        }

//Case3 Verificam daca unul dintre numere este negativ, pozitiv sau zero
        if (num1 >= 0) {
            if (num1 == 0) {
                System.out.println("Numarul 1 este zero");
            } else {
                System.out.println("Numarul 1 este pozitiv");
            }
        } else {
            System.out.println("Numarul 1 este negativ");
        }
        if (num2 >= 0) {
            if (num2 == 0) {
                System.out.println("Numarul 2 este zero");
            } else {
                System.out.println("Numarul 2 este pozitiv");
            }
        } else {
            System.out.println("Numarul 2 este negativ");
        }

//Case4 Gaseste maximum intre trei numere (if else)
        //? Cum putem prelucra cind 2 numere max sunt egale, pe care sa il afisam sau le aratam pe ambele?
        if (num1 != num2 || num1 != num3 && num2 != num3) {
            if (num1 > num2 && num1 > num3) {
                System.out.println("Numarul maximal este num1 cu valoarea " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("Numarul maximal este num2 cu valoarea " + num2);
            } else {
                System.out.println("Numarul maximal este num3 cu valoarea " + num3);
            }
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("Toate numerele sunt egale");
        }

//Case4 Gaseste maximum intre trei numere (switch)

    }
}


