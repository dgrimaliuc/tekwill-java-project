package main.java.georgeVinaga;

public class ClassWork_16_Dec_2024 {
    public void main(String[] args) {

// Funcția while
       /*
        int cifra = 1;
        while (cifra <= 10) {   // in paranteză punem true, si va merge pina la infinit
            System.out.println("Numar: " + cifra);
            cifra = cifra + 1; // sau se poate de folosit acest cod in rind (cifra++;), în loc de (cifra = cifra + 1;
        }
         */
//---------------------------------------------------------------------------------------------------------------------
        /*
         // Scrie un program care afișează toate numerele pare de la 0 la 50 folosind o buclă while.
        int count = 1;
        while (count <= 50) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
         */
//---------------------------------------------------------------------------------------------------------------------
      /*
       // Implementează un program care cere utilizatorului să introducă o parolă până când parola corectă este introdusă.
        Scanner sc = new Scanner(System.in);
        String password = "aaaaaa"; // Parola corectă
        String intorvsPassword; // Variabilă pentru parola introdusă
        do {
            System.out.println("Introduceti parole: ");
            intorvsPassword = sc.nextLine();
        } while (!intorvsPassword.equals(password));
       */
//---------------------------------------------------------------------------------------------------------------------
        /*
        // Creează un program care calculează suma tuturor numerelor pare între 1 și 100 folosind o buclă while.
        int count = 1;
        int sum = 0;
        while (count <= 100) {
            if (count % 2 == 0) {
                sum += count;
            }
            count++;
        }
        System.out.println(sum);
        */
//---------------------------------------------------------------------------------------------------------------------
        /*
        // Exemplu decrementatia
        // Implementeaza un program care calculeaza suma numerelor pare de la 1 la 10 folosind bucla while
        int count = 10;
        int sum = 0;
        while (count > 0) {
            if (count % 2 == 0) {
                sum += count;
            }
            count = count - 1;  // sau se poate folosi count--
        }
        System.out.println(sum);
        */
//---------------------------------------------------------------------------------------------------------------------
        /*
        //  1. Scrie un program care numără de la 10 la 1 folosind  ciclu while.
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
         */
//---------------------------------------------------------------------------------------------------------------------
        /*
        // 2. Scrie un program care afișează suma tuturor numerelor pare de la 0 la 50 folosind ciclu while.
        int count = 0;
        int sum = 0;
        while (count <= 50) {
            if (count % 2 == 0) {
                sum += count;
            }
            count++;
        }
        System.out.println(sum);
         */

//======================================================================================================================
// Funcția for

//        for (int i = 1; i < 10; i++) {
//            System.out.println("Count: " + i);
//        }
//---------------------------------------------------------------------------------------------------------------------
        // Crementare: Scrie un program care numara de la 1 la 10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//---------------------------------------------------------------------------------------------------------------------
        // Decrementare: Scrie un program care numara de la 10 la 1. Decrementare:
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
//---------------------------------------------------------------------------------------------------------------------
        // Afișează toate numerele impare între 10 și 30.
//        for (int i = 11; i <= 30; i += 2) {    // i += 2 sau i = i + 2
//            System.out.println(i);
//        }
//---------------------------------------------------------------------------------------------------------------------
        // Scrie un program care afișează tabela înmulțirii pentru un număr dat (6*1, 6*2, 6*3…).
//        int number = 5;
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(number + " x " + i + " = " + number * i);
//        }
//---------------------------------------------------------------------------------------------------------------------
        // 1.  Scrie un program care numara de la 10 la 1 folosind o buclă for.
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//---------------------------------------------------------------------------------------------------------------------
//        // 2.  Scrie un program care afișează suma tuturor numerelor impare de la 1 la 51 folosind o buclă for.
//        for (int i = 51; i >= 1; i -= 2) {
//            System.out.println(i);
//        }
//======================================================================================================================


// Break and Continue
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                break; // break
//            }
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                continue; // continue
//            }
//            System.out.println(i);
//        }
//---------------------------------------------------------------------------------------------------------------------

        // Implementeaza un program care cere utilizatorului sa introduca o serie de note pana cand o nota negativa este introdusa.
//        int num;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter a number: ");
//            num = sc.nextInt();
//            if (num < 0) {
//                break;
//            }
//        } while (true); // sau ]n paranteza punem true

        // Scrie un program Java care afiseaza toate numerele pare intre 1 si 20, excluzand multiplii de 5.
//        System.out.println("Numere pare între 1 și 20 (excluzând multiplii lui 5):");
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) { // Skip odd number
//                continue;
//            }
//            if (i % 5 == 0) { // Skip multiples of 5
//                continue;
//            }
//            System.out.println(i);
//        }

//======================================================================================================================

// Arrey

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[0]);
        // Rezultatul va fi Volvo


//        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(car[0]); // Rezultatul va fi Volvo
//        car[0] = "Opel"; // Schimba Volvo cu Opel
//        System.out.println(car[0]); // Rezultatul va fi Opel

//        String[] masina = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(masina.length); // arata cite elemente sunt intr-un arrey
        // Rezultatul va fi 4

//----------------------------------------------------------------------------------------------------------------------
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[1]);
//        }

//        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : car) {
//            System.out.println(i);
//        }
//----------------------------------------------------------------------------------------------------------------------
        //Afișează toate elementele unui array (varianta lunga de cod)
//        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (int i = 0; i < car.length; i++) {
//            System.out.println(i);
//        }

        //Afișează toate elementele unui array (varianta scurta de cod)
//        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String s : car) {
//            System.out.println(s);
//        }

//----------------------------------------------------------------------------------------------------------------------
        //Suma array-ului: Scrie un program care calculează suma tuturor elementelor dintr-un array.
//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i : array) {
//            sum = sum + i; // sau poti scrie: sum += i;
//        }
//        System.out.println("Suma elementelor din arrey este: " + sum);

        //Scrie un program Java pentru a găsi elementul minim într-un array de numere întregi.
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 60, -50, 43, 123, 312};
//        int min = numbers[0];
//        for (int i : numbers) {
//            if (i < min) {
//                min = i;
//            }
//        }
//        System.out.println("Minimal este: " + min);


        // Scrie un program Java pentru a găsi elementul maxim într-un array de numere întregi.
//        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 60, -50, 43, 123, 312};
//        int sum = 0;
//        for (int i : number) {
//            sum = sum + i; // sau poti scrie: sum += i;
//        }
//        System.out.println("Media aritmetica a numerelor din array este: " + sum / number.length);
    }
}
