package AnastasiaGoncear.Lesson8AnastasiaGoncear.Exceptions;

public class Runner {

    public static void toUpperCase(String input) {
        if (input == null) {
            throw new NullPointerException("The provided string is null.");
        }

        String upperCaseString = input.toUpperCase();
        System.out.println(upperCaseString);
    }

        public static void main(String[] args) {
            try {
                toUpperCase("hello");
                toUpperCase(null);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }}