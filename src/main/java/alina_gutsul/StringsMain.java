package alina_gutsul;

public class StringsMain {
    public static void main(String[] args) {
        String str = "Automated testers: saving developers from their own code since forever!";

        //Count the number of characters in a given string
        int charCount = str.length();

        //Convert a string to uppercase
        String upperCaseString = str.toUpperCase();

        //Check if a string contains a specific substring
        String substr = "developera";
        boolean containsSubstring = str.contains(substr);

        //Remove all whitespace characters from a string.
        String withoutWhitespace = str.replaceAll("\\s", "");

        //Extract a substring from a string.
        int startIndex = 7;
        int endIndex = 12;
        String extractedSubstring = str.substring(startIndex, endIndex);

        System.out.println("Character count: " + charCount);
        System.out.println("Uppercase string: " + upperCaseString);
        System.out.println("Contains '" + substr + "': " + containsSubstring);
        System.out.println("String without whitespace: " + withoutWhitespace);
        System.out.println("Extracted substring: " + extractedSubstring);
    }
}
