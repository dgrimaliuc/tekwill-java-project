package VictorMurashev.lesson20240724_error_excep;

public class DivisionByZero {

    public static void main(String[] args) {
        divide(10, 5);
        divide(10, 0);
    }

    public static void divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int result = a / b;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

