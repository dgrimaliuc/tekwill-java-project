package ana_raetcaia.task_seven;

import static ana_raetcaia.task_seven.Arithmetic.divideNumbers;

public class ArithmeticTest {
    public static void main(String[] args) {
        try {
            System.out.println(divideNumbers(65, 0));

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
