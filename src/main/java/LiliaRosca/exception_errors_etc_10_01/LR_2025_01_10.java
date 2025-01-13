package main.java.LiliaRosca.exception_errors_etc_10_01;

public class LR_2025_01_10 {
// exception - error
    // NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException, etc.
    // OutOfMemoryError, StackOverFlowError, NoClassDefFoundError, etc.

    /*public static void main(String[] args) {
        // Arithmetic exception - / by zero
        *//*int num = 1;
        System.out.println(num / 0);*//*
        // NullPointerException - Cannot invoke "java.lang.Boolean.booleanValue()" because "s" is null
        *//*Boolean s = null;
        System.out.println(s.booleanValue());*//*
        // ArrayIndexOutOfBoundsException - Index 100 out of bounds for length 5
        *//*int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[100]);*//*
    }*/
    // StackOverflowError
    /*public static void printDay() {
        System.out.println(1);
        printDay();
    }

    public static void main(String[] args) {
        printDay();
    }*/

// try / catch - pentru gestionarea exceptiilor  -  // try   catch   finally - optional
    /*public static void main(String[] args) {
        // try   catch   finally - optional
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // 1 - without error
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }*/

    /*public static void divide(int a, int b) { // exercitiu in clasa
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) { // catch (Exception e) - merge si asa
            System.out.println("Not a number.");
        }
    }

    public static void main(String[] args) {
        divide(10, 2); // cu 0 - da Not a number.
    }*/

    /*public static void printSecond(int[] arr) { // exercitiu in clasa
        try {
            System.out.println(arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) { // catch (Exception e) - merge si asa
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        printSecond(new int[]{10, 2});
    }*/

    // de sine statator
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

// throw - custom exceptions
    // exercitii in clasa
    /*public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by 0");
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        divide(10, 2); // cu 0 - da Can't divide by 0
    }*/

    /*public static void printSecondElement(int[] array) {
        if (array == null || array.length < 2) {
            throw new IndexOutOfBoundsException("Array is too short");
        }
        System.out.println(array[1]);
    }

    public static void main(String[] args) {
        printSecondElement(new int[]{1, 2, 3});// cu null - da Array is too short
    }*/

    // class myException
/*    public static void main(String[] args) {
        try {
            throw new myException("Custom exception occured!");
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }*/

    // unchecked / checked exception
    // class MyUncheckedException
 /*   public static void main(String[] args) {
        throw new MyUncheckedException("My Unchecked Exception");
    }*/

    //exercitii in clasa
    // PersonalNullException - unchecked
/*    public static void toUpperCase(String string) {
        if (string == null) {
            throw new PersonalNullException("String is null");
        }
        System.out.println(string.toUpperCase());
    }

    public static void main(String[] args) {
        toUpperCase(null);
    }*/

    // PersonalBoundException - checked - sau cu throws sau cu try / catch
/*    public static void printSecondElement(int[] array) throws PersonalBoundException {
        if (array == null || array.length < 2) {
            throw new PersonalBoundException("Array is too short");
        }
        System.out.println(array[1]);
    }

    // best practices - pe main nu se adauga trows
    public static void main(String[] args) {
        try {
            printSecondElement(null);
        } catch (PersonalBoundException e) {
            e.printStackTrace(); // arata mesajul erorii - acela cu rosu
        }
    }*/

// resources in Java
    // try with resources - nu va fi utilizat, doar pentru informatie ca este asa ceva

}
