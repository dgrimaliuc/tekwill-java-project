package main.java.LiliaRosca.exception_errors_etc_10_01;

public class LR_2025_01_10 {
    // exception - error
    // NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException, etc.
    // OutOfMemoryError, StackOverFlowError, NoClassDefFoundError, etc.
    /*public static void main(String[] args) {
        // try catch   finally - optional
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // 1 - without error
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }*/

    // Creează o metodă „toUpperCase” și afișează literele mari ale unui string furnizat.
    // Capturează NullPointerException și, la captura excepției, afișează „String Is Null”.
    /*public static void toUpperCase(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void main(String[] args) {
        try {
            toUpperCase(null); // "null" - transforma in Uppercase
        } catch (NullPointerException e) {
            System.out.println("String Is Null");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }*/

// throw - Exception - telegram 19:24, 19:26

    // custom exceptions
    // class myException
/*    public static void main(String[] args) {
        try {
            throw new myException("Custom exception occured!");
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }*/

// unchecked exception

// resources in Java


}
