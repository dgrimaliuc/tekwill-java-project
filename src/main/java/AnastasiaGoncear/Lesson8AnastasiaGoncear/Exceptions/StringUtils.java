package AnastasiaGoncear.Lesson8AnastasiaGoncear.Exceptions;

public class StringUtils {
    public static void toUpperCase(String input) throws NullStringException {
        if (input == null) {
            throw new NullStringException("The provided string is null.");
        }

        String upperCaseString = input.toUpperCase();
        System.out.println(upperCaseString);
    }

    public static void main(String[] args) {
        try {
            toUpperCase("hello");
            toUpperCase(null);
        } catch (NullStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
