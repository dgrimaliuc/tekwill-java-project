package anna_gontari;

public class StringsMain {
    public static void main(String[] args) {
        //Count the number of characters in a given string.
        String string = "After June comes July";
        System.out.println(string.length());

       //Convert a string to uppercase.
        System.out.println(string.toUpperCase());

        //Check if a string contains a specific substring. Method that I found online
        String substring = "June";
        System.out.println(string.contains(substring));

        //Check if a string contains a specific substring. Method used during lesson
        if (string.equals("After June comes July")) {
            System.out.println("The string contains J");
        } else {
            System.out.println("The string doesn't contains J");
        }

        //Remove all whitespace characters from a string.
        System.out.println(string.replaceAll(" ", ""));

        //Extract a substring from a string.
        System.out.println("Everybody knows, that " + string);

    }
}
