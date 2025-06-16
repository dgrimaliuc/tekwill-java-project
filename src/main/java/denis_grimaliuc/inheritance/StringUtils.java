package main.java.denis_grimaliuc.inheritance;


/**
 * Creează o clasă numită “StringUtils” cu o metodă supraîncărcată pentru concatenare.
 * Implementează metode care pot concatena două șiruri de caractere,
 * trei șiruri de caractere
 * și un list de șiruri de caractere.
 */
public class StringUtils {


    // Două șiruri de caractere

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Trei șiruri de caractere
    public static String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }


    // Un arrays de șiruri de caractere
    public static String concatenate(String... strings) {

        String result = "";
        for (String str : strings) {
            result = result + str;
        }
        return result;
    }

    public static void main(String[] args) {
        String r = concatenate("Hello", " ", "World", "!", "!", "!");
        System.out.println(r);
    }

}
