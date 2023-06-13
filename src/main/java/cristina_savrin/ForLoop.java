package cristina_savrin;

public class ForLoop {

    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10 using a for loop
        System.out.print("1. Numbers from 1 to 10 using For loop: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // 2. Print numbers from 1 to 10 using foreach loop
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("\n2. Numbers from 1 to 10 using Foreach loop: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // 3. Calculate the sum of numbers from 1 to 100 using a for loop.
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum += j;
        }
        System.out.print("\n3. Sum of numbers from 1 to 100 using For: " + sum);

        // 4. Calculate the factorial of a given number using a for loop.
        int givenNumber = 16;
        int factorial = 1;
        for (int k = 1; k <= givenNumber; k++) {
            factorial *= k;
        }
        System.out.println("\n4. Factorial of " + givenNumber + " is: " + factorial);
    }
}