package main.java.NataliaChihai;

public class Arrays {
    public static void main(String[] args) {
        // Calculează suma numerelor de la 55 la 111 folosind o buclă do-while
        int suma = 0;
        int i = 55;

        do {
            suma += i;
            i++;
        } while (i <= 111);

        System.out.println("Suma numerelor de la 55 la 111 este: " + suma);


        // Calculează suma numerelor de la 1 la 100 folosind o buclă for
        int sum = 0;

        for (int j = 1; j <= 100; j++) {
            sum += j;
        }

        System.out.println("Suma numerelor de la 1 la 100 este: " + sum);


        // Scrie un program Java pentru a verifica dacă un element există într-un array de numere întregi

        int[] array = {10, 20, 30, 40, 50};
        int elementCautat = 30;
        boolean gasit = false;

        for (int numar : array) {
            if (numar == elementCautat) {
                gasit = true;
                break;
            }
        }

        if (gasit) {
            System.out.println("Elementul " + elementCautat + " există în array.");
        } else {
            System.out.println("Elementul " + elementCautat + " NU există în array.");
        }

        //Scrie un program Java pentru a număra numărul de elemente pozitive într-un array de numere întregi
        int[] array1 = { -5, 3, 0, 7, -2, 9, -1, 4 };
        int countPozitive = 0;

        for (int numar : array1) {
            if (numar > 0) {
                countPozitive++;
            }
        }

        System.out.println("Numărul de elemente pozitive din array este: " + countPozitive);
    }

}

//int count = 5;
//        while (count <= 5) {
//        System.out.println("Count " + count);
//count++;
//        }
//int numar = 10;
//
//        while (numar >= 1) {
//        System.out.println(numar);
//numar--;
//        }
//int num = 0;
//int suma = 0;
//
//        while (num <= 50) {
//        if (num % 2 == 0) {
//suma += num;
//            }
//num++;
//        }
//
//        System.out.println("Suma numerelor pare de la 0 la 50 este: " + suma);
//
//// ciclu for
//
//        for (int i = 1; i <= 5;i++){
//        System.out.println("count " + i);
//        }
////Scrie un program care afișează tabela înmulțirii pentru un număr dat (6*1, 6*2, 6*3…).
//int n=5;
//        for (int j = 1; j <= 10; j++) {
//int rezultat = n * j;
//            System.out.println(n + " x " + j + " = " + rezultat);
//        }
//
//// Scrie un program care afișează suma tuturor numerelor impare de la 1 la 51 folosind for.
//int sum = 0;
//        for (int i = 1; i <= 51; i += 2) {
//sum += i;
//        }
//                System.out.println("Suma numerelor impare de la 1 la 51 este: " + sum);
//
////strings
//String[] cars = {"Volov", "BMW", "Ford", "Mazda"};
//        for (String i : cars){
//        System.out.println(i);
//       }