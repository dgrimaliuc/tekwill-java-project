package main.java.Magda_Petrachi;

import java.util.Scanner;

public class ArraysCycle {
      //Scrie un program Java pentru a verifica dacă un element există într-un array de numere întregi.
      //Scrie un program Java pentru a număra numărul de elemente pozitive într-un array de numere întregi.

        public static void main(String[] args) {
            int[] numere = {3, -7, 12, -5, 0, 9, 18, -2, 4, -10};

            Scanner sc = new Scanner(System.in);

            // Verificare dacă un număr există
            System.out.print("Introdu un număr pentru verificare: ");
            int cautat = sc.nextInt();

            boolean gasit = false;
            for (int num : numere) {
                if (num == cautat) {
                    gasit = true;
                    break;
                }
            }

            if (gasit) {
                System.out.println("Numărul " + cautat + " există în array.");
            } else {
                System.out.println("Numărul " + cautat + " NU există în array.");
            }

            // Numărare elemente pozitive
            int countPozitive = 0;
            for (int num : numere) {
                if (num > 0) {
                    countPozitive++;
                }
            }

            System.out.println("Numărul de elemente pozitive este: " + countPozitive);
        }
    }
