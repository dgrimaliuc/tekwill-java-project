package alina_gutsul.exceptions;

public class StringToIntConverterCheck {
    public static void main(String[] args) {
        try {
            int number = convertToInt("abc");
            System.out.println("The converted integer is: " + number);
        } catch (ParseToIntException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertToInt(String str) throws ParseToIntException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new ParseToIntException("Unable to parse int from string: " + str);
        }
    }
}
