package roman_marcov;


public class StringsMain {
    public static void main(String[] args) {
        /* Strings:
1. Count the number of characters in a given string.
2. Convert a string to uppercase.
3. Check if a string contains a specific substring.
4. Remove all whitespace characters from a string.
5. Extract a substring from a string.
         */
        //#1
        String message = "Count the number of characters in a given string.";
        int length = message.length();
        System.out.println("#1");
        System.out.println("number of characters: " + length);
//#2
        String upperMessage = "Convert a string to uppercase";
        String upper = upperMessage.toUpperCase();
        System.out.println("#2");
        System.out.println(upper);
//#3
        String string1 = "Check if a string contains a specific substring";
        String substring = "contains";
        System.out.println("#3");
        System.out.println(string1.contains(substring));
//#4
        String str = "Remove all whitespace characters from a string";
        String noSpaceStr = str.replaceAll(" ", "");
        System.out.println("#4");
        System.out.println("String after removeble: " + noSpaceStr);
//#5
        String s1 = "Extract a substring from a string";
        System.out.println("#5");
        System.out.println(s1.substring(5, 15));
        System.out.println(upper);
    }
}
