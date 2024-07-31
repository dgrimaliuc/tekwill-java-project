package VictorMurashev.lesson20240724_error_excep;

public class UpperCaseException {
    public static void main(String[] args) {
        //Normal case
        toUpperCase("Hello World");
        //Null pointer case
        toUpperCase(null);
    }

    public static void toUpperCase(String str) {
        try {
            String upString = str.toUpperCase();
            System.out.println("Uppercase string: " + upString);
        } catch (NullPointerException e) {
            System.out.println("String Is Null");
        }
    }
}
