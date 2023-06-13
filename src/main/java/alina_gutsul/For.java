package alina_gutsul;
public class For {
    public static void main(String[] args) {
        //Print numbers from 1 to 10 using a for loop (using foreach loop)
        System.out.println("1. Print numbers from 1 to 10 using a for loop (using foreach loop)");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            System.out.print(number + " " );
        }

        //Calculate the sum of numbers from 1 to 100 using a for loop.
        System.out.println("\n\n2. Calculate the sum of numbers from 1 to 100 using a for loop.");
        int total = 0;
        for (int n = 1; n <= 100; n++) {
            total += n;
        }
        System.out.println("Sum: " + total);

        //Calculate the factorial of a given number using a for loop.
        System.out.println("\n3. Calculate the factorial of a given number using a for loop.");
        int factorialNumber = 5;
        int factorial = 1;
        for (int m = 1; m <= factorialNumber; m++) {
            factorial *= m;
        }
        System.out.println("Factorial of " + factorialNumber + ": " + factorial);

        //(Optional ) Print all numbers from 20 to 0 with step 2 ( 20, 18, 16, 14)
        System.out.println("\n4. (Optional ) Print all numbers from 20 to 0 with step 2 ( 20, 18, 16, 14)");
        for (int p = 20; p >= 0; p -= 2) {
            System.out.print(p + " ");
        }
    }
}
