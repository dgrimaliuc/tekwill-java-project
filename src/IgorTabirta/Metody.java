package IgorTabirta;


import java.util.Scanner;

public class Metody {
    // 1.  Write a method that takes two doubles as parameters and returns their sum.
    static double sum(double a, double b) {
        return a + b;
    }

    // 2. Write a method that takes an integer as input and returns "Even" if the number is even and "Odd" if it is odd.
    static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // 3. Write a Java method called "greet" that takes a person's name as a parameter
    //    and prints a greeting message to the console, such as "Hello, [name]!»
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 4. Write a Java method called "calculateAverage" that takes an array of
    //    integers as a parameter and returns the average of the numbers in the array.
    static double calculateAverage(int... numbers) {
        double sum1 = 0;
        for (int num : numbers) {
            sum1 += num;
        }
        return sum1 / numbers.length;
    }
    // H O M E    W O R K
    //5.  Write a Java method called "greet" that prints a greeting message to the console, such as "Hello World! »

    static void greet_1() {

        System.out.println("Hello World!");
    }
    // 6. Write a method that takes two integers as parameters and returns difference.(-)

    static int diff(int c, int d) {
        int result = c - d;
        return result;
    }
    // 7.  Create a method that accepts three integers as parameters and returns the maximum of the three.

    static int maxOf_3(int q, int w, int e) {
        int max = q;
        if (w > max) {
            max = w;
        }
        if (e > max) {
            max = e;
        }
        return max;
    }
    // 8. Create a method that will accept arguments of Integer type, return the sum of all provided numbers.

    static int sumOfArr(int... numbers1) {
        int sum3 = 0;
        for (int num : numbers1) {
            sum3 += num;
        }
        return sum3;
    }
    // 9. Write a Java method called "printNumbers" that takes an integer as a parameter
    //     and prints all the numbers from 1 to that integer.

    static void printNumbers(int n) {
        for (int j = 1; j <= n; j++) {
            System.out.println(j);
        }
    }


    public static void main(String[] args) {
        // 1.
        double result = sum(1.2, 3.4);
        System.out.println("The sum is " + result);
        // 2.
        String resultEvenOdd = Metody.evenOrOdd(7);
        System.out.println("The number is " + resultEvenOdd);
        // 3.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите ваше Имя:");
        String name = scanner.nextLine();
        // 4.
        int[] numbers = {5, 6, 3, 9, 10};
        double avg = calculateAverage(numbers);
        System.out.println(avg);
        // 5.
        greet_1();
        // 6.
        int result1 = diff(9, 15);
        System.out.println(result1);
        // 7.
        int max = maxOf_3(60, -2, -70);
        System.out.println("Максимум из трех чисел: " + max);
        // 8.
        int[] numbers1 = {6, 9, 1, 23, 48, 65};
        int sum = sumOfArr(numbers1);
        System.out.println("Сумма чисел = " + sum);
        // 9.
        printNumbers(5);


    }
}




