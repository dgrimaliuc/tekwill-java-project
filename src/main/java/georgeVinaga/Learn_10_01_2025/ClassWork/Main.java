package main.java.georgeVinaga.Learn_10_01_2025.ClassWork;

public class Main {
    //-----------------------------------------------
//        public static void main(String[] args) {
//            int num = 1;
//            System.out.println((double) num); // Asta se numeste Cast, adica  din num in double.
//        }

    //-----------------------------------------------
//    //ArithmeticException
//          public static void main(String[] args) {
//            int num = 1;
//            System.out.println(num / 0);
//         }
    //-----------------------------------------------
    //NullPointerException
//        public static void main(String[] args) {
//            Boolean s = null;
//            System.out.println(s.booleanValue());
//        }
    //-----------------------------------------------
    //ArreyIndexOutIfBoundsException
//        public static void main(String[] args) {
//            int[] arrey = {1, 2, 3, 4, 5};
//            System.out.println(arrey[100]);
//    }
    //-----------------------------------------------
    //StackOverflowError
//        public static void printDay(){
//            System.out.println(1);
//            printDay();
//        }
//        public static void main(String[] args) {
//        printDay();
//        }
    //-----------------------------------------------
    //Exemplu de utilizare try catch
//    public static void main(String[ ] args) {
//        int[] myNymbers = {1, 2, 3};
//        System.out.println(myNymbers[10]); // error: ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
//    }
    //-----------------------------------------------
    //Exemplu de utilizare try catch
    // Dacă apare o eroare, putem folosi try...catch pentru a detecta eroarea și a executa cod pentru a o gestiona
//    public static void main(String[] args) {
//        try {
//            int[] myNymbers = {1,2,3};
//            System.out.println(myNymbers[10]);
//        } catch (Exception e) {
//            System.out.println("Something went wrong");
//        }
//    }

    //-----------------------------------------------
    //Exemple de utilizare try catch with finally
    //Instrucțiunea final vă permite să executați codul după try...catch, indiferent de rezultat
//    public static void main(String[] args) {
//        try {
//            int[] myNymbers = {1,2,3};
//            System.out.println(myNymbers[10]);
//        } catch (Exception e) {
//            System.out.println("Something went wrong");
//        } finally {
//            System.out.println("The 'try catch' is finished.");
//        }
//    }

    //-----------------------------------------------
    //Creeaza o metoda „devide” și afișează rezultatul. Captură o ArithmeticException și afișează „Not a Number”.
//    public static void divide(int a, int b) {
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("Not a Number");
//        }
//    }
//    public static void main(String[] args) {
//        divide(10, 2); // Daca pun cifra 0 in loc de cifra 2, va da mesaju "Not a Number"
//    }

    //-----------------------------------------------


    //-----------------------------------------------
    /*
    Creează o medodă „printSecond” și afișează al doilea element dintr-un array.
    În interiorul metodei, capturează ArreyIndexOutOfBoundsException și afișează „Not Found” la captura excepției
     */
//    public static void printSecond(int[] arr) {
//        try {
//            System.out.println(arr[1]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Not Found"); // Se afiseaza Not found in loc de erroarea ArrayIndexOutOfBoundsException
//        }
//    }
//    public static void main(String[] args) {
//        printSecond(new int[]{10, 2}); // Daca pun cifra 0 in loc de cifra 2, va da mesaju "Not Found"
//    }

    //-----------------------------------------------
    /* ChatGPT
    Creează o metodă „toUpperCase” și afișează literele mari ale unui string furnizat.
    Capturează NullPointerException și, la captura excepției afișează „String is Null”.
     */
//    public static void toUpperCase(String string) {
//        try {
//            System.out.println(string.toUpperCase()); // Încercăm să convertim string-ul la litere mari
//        } catch (NullPointerException e) {
//            System.out.println("String is Null"); // Capturăm excepția NullPointerException și afișăm mesajul corespunzător
//        }
//    }
//
//    public static void main(String[] args) {
//        toUpperCase(null); // Testăm metoda cu un parametru null
//    }

    //-----------------------------------------------
    // Instruc'iunea throw permite crearea unei erori personalizate.
    // Cum ar fi: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException și altele.
//        static void checkAge(int age) {
//            if (age < 18) {
//                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//            } else {
//                System.out.println("Acces granted - You are old enough!");
//        }
//    }
//
//        public static void main(String[] args) {
//            checkAge(15); // Set age to 15 (wich is below 18...)
//        }

    //-----------------------------------------------
    // Creeaz[ o metod[ „divide” și afișează rezultatul. Dacă al doilea element este zero, aruncă ArithmeticException.
//    public static void divide(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Cant't divide by zero");
//        }
//        System.out.println(a / b);
//    }
//
//    public static void main(String[] args) {
//        divide(1,0); // Daca in loc de 0 va fi 1 rezultatul va fi 1.
//    }
    //-----------------------------------------------
    /*
    Creează o metodă „printSecond” și afișează al doilea element dintr-un array.
    Dacă array-ul are lungimea mai mică decât 2, aruncă IndexOutOfBoundsException.
     */
//    public static void printSecondElement(int[] array) {
//        if (array == null || array.length < 2) {
//            throw new IndexOutOfBoundsException("Array is to short");
//        }
//        System.out.println(array[1]);
//    }
//    public static void main(String[] args) {
//        printSecondElement(new int[]{1, 2, 3});
//    }


    //-----------------------------------------------


}
