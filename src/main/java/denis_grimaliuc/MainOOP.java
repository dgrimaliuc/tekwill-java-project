package main.java.denis_grimaliuc;

public class MainOOP {
    public static void toUpperCase(String string) {

        System.out.println(string.toUpperCase());
    }


    /**
     * Creează o metodă „printSecond” și afișează al doilea element dintr-un array.
     * În interiorul metodei,
     * capturează ArrayIndexOutOfBoundsException și afișează „Not Found” la captura excepției.
     */
    public static void printSecond(int... arr) {

        try {
            System.out.println(arr[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not Found");
        }

    }


    /**
     * Creează o metodă „divide” și afișează rezultatul.
     * Captură o ArithmeticException și afișează „Not a Number”.
     *
     * @param a
     * @param b
     * @return
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Not a number");
            return 0;
        }

        return (double) a / b;


    }

    /**
     * În clasa principală, creează un list de tip “Animal” și stochează instanțe
     * * de “Dog”, “Cat” și “Bird”, apoi iterează prin lista pentru a apela metoda makeSound.
     *
     * @param args
     */
    public static void main(String[] args) {
        printSecond();
    }

}

