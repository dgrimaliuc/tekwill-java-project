package alexandr_samohvalov;

public class StringsMain {
    // Count the number of characters in a given string.
    public static void s(String[] args) {
        String txt = "I hope I am right ";
        System.out.println(txt.length());
    }


    // Convert a string to uppercase.
    public static void sas(String[] args) {
        String txt = "I hope I am right ";
        System.out.println(txt.toUpperCase());
    }

    //  Check if a string contains a specific substring.
    public static void aaq(String[] args) {
        String txt = "I hope I am right ";
        System.out.println(txt.endsWith(" "));
    }


    //  Remove all whitespace characters from a string.
    public static void aafsmain(String[] args) {
        String txt = "    I hope I am right     ";
        System.out.println(txt.trim());
    }

    //  Remove all whitespace characters from a string.
    public static void main(String[] args) {
        String txt = "I hope I am right";
        System.out.println(txt.substring(2, 7));
    }
}