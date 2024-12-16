package main.java.LunguSergiu;

import java.util.Scanner;

public class task3class {
    //    public static void main(String[] args) {
//        int age = 15;
//        if (age >= 18) {
//            System.out.println("Esti adult");
//        } else {
//            System.out.println("Esti minor");
//        }
//    }
    //al 2 ex
//    public static void main(String[] args) {
//        int num = 10;
//        if (num > 0) {
//            if (num % 2 == 0) {
//                System.out.println("Numar pozitiv par");
//            } else {
//                System.out.println("Numar pozitiv impar");
//            }
//        } else if (num < 0) {
//            System.out.println("Numar negativ");
//        } else {
//            System.out.println("Zero");

    //    //Găsește suma a două numere
//    public static void main(String[] args) {
//        int a = 3;
//        int b = 5;
//        int sum = a + b;
//    }
//}
    //Verifică dacă două numere sunt egale
//    public static void main(String[] args) {
//        if (5 == 5) {
//            System.out.println("Numerele sunt egale.");
//        } else {
//            System.out.println("Numerele nu sunt egale.");
//        }
    //Verifică dacă un număr este pozitiv, negativ sau zero folosind if-else
//    public static void main(String[] args) {
//        if (1 > 0) {
//            System.out.println("Numărul este pozitiv");
//        } else if (1 < 0) {
//            System.out.println("Numărul este negativ");
//        } else {
//            System.out.println("Numărul este zero");
//        }
//    }
//}
//    //Găsește maximul dintre 3 numere
//    public static void main(String[] args) {
//        int maxim;
//        if (10 >= 8 && 10 >= 6) {
//            maxim = 10;
//        } else if (8 >= 10 && 8 >= 6) {
//            maxim = 8;
//        } else {
//            maxim = 6;
//            System.out.println("Numarul maxim este:" + maxim);
//        }
//    }
//}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce vîrsta: ");
        int vîrsta = sc.nextInt();
        if (vîrsta >= 18) {
            System.out.println("Ești major");
        } else {
            System.out.println("Ești minor");
        }
        sc.close();
    }
}