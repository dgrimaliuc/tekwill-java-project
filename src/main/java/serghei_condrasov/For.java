package serghei_condrasov;

import java.util.Collections;

public class For {

    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10 using a for loop.
        for (int i = 1; i < 10; i++)
        System.out.print(i + " ");

        // 2. Calculate the sum of numbers from 1 to 100 using a for loop.
        int summ = 0;
        for (int a = 1; a <= 100; a++) {
            summ = summ + a;
        }
        System.out.print("\n" + summ);

        // 3. Calculate the factorial of a given number using a for loop.
        int n = 4;
        int result = 1;
        for (int c = 1; c <= n; c++) {
            result = result * c;
        }
        System.out.print("\n" + result);

        // 4. (Optional ) Print all numbers from 20 to 0 with step 2 ( 20, 18, 16, 14).
        for (int f = 20; f > 0; f--) {
            if (f % 2 == 0) {
                System.out.print("\n" + f + " ");
            }
        }
    }
}
