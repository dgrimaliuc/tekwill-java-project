package main.java.georgeVinaga.Learn_10_01_2025.ClassWork;

public class Main {
    //-----------------------------------------------
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
    /*
    Creează o medodă „printSecond” și afișează al doilea element dintr-un array.
    În interiorul metodei, capturează ArreyIndexOutOfBoundsException și afișează „Not Found” la captura excepției
     */
//    public static void printSecond(int[] arr) {
//        try {
//            System.out.println(arr[1]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Not Found");
//        }
//    }
//    public static void main(String[] args) {
//        printSecond(new int[]{10, 2}); // Daca pun cifra 0 in loc de cifra 2, va da mesaju "Not Found"
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
    public class MyException extends Exception {
        public MyException() {
            super(); // Cheama constructorul superclass
        }
        public MyException (String message) {
            super(message); // Cheama constructorul super class cu un mesaj
        }
    }
    public class Example {
        public static void main(String[] args) {
            try {
                throw new MyException("Custom exception occurred!");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
