package ana_raetcaia.task_seven;

public class ArithmeticTest {
    public static void main(String[] args) {
        Arithmetic divineObj = new Arithmetic();
        try {
            System.out.println(divineObj.divideNumbers(65, 0));

        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
