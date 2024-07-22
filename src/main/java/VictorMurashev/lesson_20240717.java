package VictorMurashev;

public class lesson_20240717 {
    public static void main(String[] args) {
        //Task 1
        greet();

        //Task 2
        int a = 10;
        int b = 5;
        int result = subtract(a, b);
        System.out.println("The difference is: " + result);

        //Task 3
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum value is: " + max);

        //Task 4
        int sum = sumAll(1, 2, 3, 4, 5);
        System.out.println("The sum is: " + sum);

        //Task 5
        printNumbers(10);

    }

    //Task 1
    public static void greet() {
        System.out.println("Hello World!");
    }

    //Task 2
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    //Task 3
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    //Task 4
    public static int sumAll(Integer... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //Task 5
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

}
