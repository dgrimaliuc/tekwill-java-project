package zabun_mihail;

public class For {

    public static void main(String[] args) {
        printNum();
        foreach();
        calculate();
        factorial();
    }
        // 1. Print numbers from 1 to 10 using a for loop
        public static void printNum() {
            System.out.print(" ");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
        }
        // 2. Print numbers from 1 to 10 using foreach loop
        public static void foreach() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.print("\n ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
        // 3. Calculate the sum of numbers from 1 to 100 using a for loop.
        public static void calculate() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.print("\n " + sum);
    }
    // 4. Calculate the factorial of a given number using a for loop.
    public static void factorial() {
    long num = 18;
    long f = 1;
        for (long i = 1; i <= num; i++) {
        f *= i;
    }
        System.out.println("\n Factorial of " + num + " is: " + f);
}
}
