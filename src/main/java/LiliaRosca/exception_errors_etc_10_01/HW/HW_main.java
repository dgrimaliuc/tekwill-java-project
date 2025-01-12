package main.java.LiliaRosca.exception_errors_etc_10_01.HW;

public class HW_main {
    // 1. Creează o metodă „divide” și afișează rezultatul. Captură o ArithmeticException și afișează „Not a Number”.
/*    public static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Not a number.");
        }
    }

    public static void main(String[] args) {
        divide(10, 0); // cu 0 - da Not a number.
    }*/

    // 2. Creează o metodă „printSecond” și afișează al doilea element dintr-un array.
    // În interiorul metodei, capturează ArrayIndexOutOfBoundsException și afișează „Not Found” la captura excepției.
    public static void printSecond(int[] arr) {
        try {
            System.out.println(arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        printSecond(new int[]{10}); // cu {10, 2} - arata 2
    }

    // 3. (Hard Optional) Creează o excepție unchecked numită PersonalNumberException.
    // Scrie un program care cere utilizatorului un string și
    // încearcă să-l convertească într-un număr de tip int folosind metoda Integer.parseInt().
    // Dacă stringul nu poate fi convertit într-un număr, programul ar trebui să arunce o NumberFormatException.
    // Gestionează excepția și aruncă PersonalNumberException cu: „Impossible to parse int from string: ” + stringFromTerminal.

}
