package main.java.daniel_sontu;

public class UpperCase {

    public static void toUpperCase(String input) {
        try {
            String upper = input.toUpperCase();
            System.out.println("Rezultat: " + upper);
        } catch (NullPointerException e) {
            System.out.println("String Is Null");
        }
    }
}
