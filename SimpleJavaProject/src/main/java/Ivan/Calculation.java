package Ivan;

public class Calculation {
    public static void calculate(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
        } while (i++ < 100);
        System.out.println("do while Sum= " + sum);

        sum = 0;
        for (int j = 0; j <= 100; j++) {
            sum += j;
        }
        System.out.println("for Sum = " + sum);
    }

    public static void main(String[] args) {
        calculate();
        calculate();
        calculate();
    }

    private static void calculate() {
    }
}