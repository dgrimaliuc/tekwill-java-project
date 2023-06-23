package Ivan.Exceptions1;

public class Parse {
    class ParseToIntException extends Exception {
        public ParseToIntException(String message) {
            super(message);
        }
    }

    class Main {
        public static void main(String[] args) {
            try {
                convertToInt("123");
                convertToInt("abc");
            } catch (ParseToIntException e) {
                System.out.println(e.getMessage());
            }
        }

        public static int convertToInt(String str) throws ParseToIntException {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                throw new ParseToIntException("Impossible to parse int from string: " + str);
            }
        }
    }
}
