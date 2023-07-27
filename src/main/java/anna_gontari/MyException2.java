package anna_gontari;

import java.util.Scanner;

public class MyException2 {
    public static void converter(String phrase) throws MyException {
        try {
            int yourLine = Integer.parseInt(phrase);
            System.out.println(yourLine);
        } catch (NumberFormatException e) {
            throw new MyException(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, enter a phrase: ");
        String phrase = userInput.nextLine();
        try {
            converter(phrase);
        } catch (MyException e) {
            System.out.println("Caught my exception");
        }
    }
}

