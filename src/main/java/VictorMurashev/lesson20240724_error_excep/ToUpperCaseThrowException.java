package VictorMurashev.lesson20240724_error_excep;

public class ToUpperCaseThrowException {

    public static void toUpperCase(String str) {
        if (str == null) {
            throw new NullPointerException("The string is null.");
        }
        String upperStr = str.toUpperCase();
        System.out.println("UpperCase string: " + upperStr);
    }

    public static void main(String[] args) {
        try {
            toUpperCase("hello world"); // Non-null String
            toUpperCase(null);           // Null string
        } catch (NullPointerException e) {
            System.out.println("Getting NullPointerException: " + e.getMessage());
        }
    }


}
