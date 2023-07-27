package alexandr_samohvalov.Exceptions;

class ParseToIntException extends Exception {
    public ParseToIntException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        String inputString = "123abc";

        try {
            int number = convertStringToInt(inputString);
            System.out.println("Parsed integer: " + number);
        } catch (ParseToIntException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int convertStringToInt(String inputString) throws ParseToIntException {
        try {
            return Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            throw new ParseToIntException("Cannot parse int from string: " + inputString);
        }
    }
}
