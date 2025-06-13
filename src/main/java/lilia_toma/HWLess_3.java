package main.java.lilia_toma;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HWLess_3 {
    public static void main(String[] args) {
//      /**  While. Calculează suma numerelor de la 55 la 111 folosind o buclă do-while.*/
//        int count = 55;
//        int totalSum = 0;
//
//        do {totalSum += count;
//            count ++;}
//        while (count <= 111);
//                System.out.println("Suma totala de la 55 la 111 este: " + totalSum);
//    }
//}

//      /**. For /Calculează suma numerelor de la 1 la 100 folosind o buclă for.*/
//      int totalSum = 0;
//      for (int i = 1; i <=100; i++) {
//          totalSum += i;}
//            System.out.println("Suma totala de la 1 la 100 este: " + totalSum);
//        }}

        /**Arrays / Scrie un program Java pentru a verifica dacă un element există într-un array de numere întregi.*/
//int[] num = {1, 8, 1024, 68761, 65, 54, 6532, 265, 687, 02, 215, 014, 10325, 40258};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introdu elementul cautat: ");
//        int elementarray = scanner.nextInt();
//        boolean found = false;
//        for (int element : num) {
//            if (element == elementarray) {
//                found = true;
//                break;
//            }
//        }
//    if (found) {
//        System.out.println("Elementul " + elementarray + " exista in array.");
//    } else {
//        System.out.println("Elementul " + elementarray + " NU exista in array.");
//    }
//    }}

        /** Scrie un program Java pentru a număra numărul de elemente pozitive într-un array de numere întregi.*/
        int[] nums = {1, 8, 1024, 68761, 65, 54, 6532, 265, 687, 20, 215, 140, 10325, 40258, -5, -42, 0, -9};
        int positiveCount = 0;

        for (int num : nums){
            if (num > 0) {
                positiveCount++;}}
        System.out.println("Numarul de elemente pozitive este: " + positiveCount);}}
