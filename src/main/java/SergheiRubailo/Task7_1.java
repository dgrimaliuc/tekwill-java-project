package SergheiRubailo;

public class Task7_1 {

    /*Write a Java method called "greet" that prints a greeting message to the console, such as "Hello World! » */
    static void greet() {
        System.out.println("Hello world!");
    }

    /*Write a method that takes two integers as parameters and returns difference.(-)*/
    static Integer diff(Integer a, Integer b) {
        return a - b;
    }

    /* Create a method that accepts three integers as parameters and returns the maximum of the three. */
    static Integer maxOfThree(Integer a, Integer b, Integer c) {
        return Math.max(Math.max(a, b), c);
    }

    /*Create a method that will accept arguments of Integer type, return the sum of all provided numbers.*/
    static Integer sum(Integer... numbers) {
        Integer temp_sum = 0;

        for (Integer number : numbers) {
            temp_sum += number;
        }
        return temp_sum;
    }

    /*Write a Java method called "printNumbers" that takes an integer as a parameter and prints all the numbers from 1 to that integer.*/
    static void printNumbers(Integer a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        greet();
        System.out.println(diff(10, 5));
        System.out.println(maxOfThree(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        printNumbers(5);
    }
}
