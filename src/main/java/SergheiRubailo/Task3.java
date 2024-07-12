package SergheiRubailo;

public class Task3 {
    public static void main(String[] args) {

        /*
        Practice NR-1
        Write a program that counts from 10 to 1 using a while loop.
        Write a program that prints the sum of all even numbers from 0 to 50 using a while loop.

        int count = 10;

        while (count >= 0) {
            System.out.println(count);
            count--;
        }

        int count2 = 0;
        int sum = 0;

        while (count2 <= 50) {
            if (count2 % 2 == 0) {
                sum = sum + count2;
            }
            count2++;
        }
        System.out.println("Sum of all even numbers: " + sum);
        */

        /*
        Write a program that counts from 10 to 1 using a for loop.
        Write a program that prints the sum of all odd numbers from 1 to 51 using a for loop.

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 51; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
         */

        /* Write a Java program to check if an element exists in an integer array. */
        int[] arr = {1, 2, 3, 4, 56, 6};
        int number = 55;
        boolean isExist = false;

        for (int i : arr) {
            if (i == number) {
                System.out.println(number + " exists in the array");
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println(number + " doesn't exist in the array");
        }

        /* Write a Java program to check if an element exists in a String array.  */
        isExist = false;
        String[] string = {"aha", "gg", "tt"};
        String check = "ah1a";
        for (String i : string) {
            if (i.equals(check)) {
                System.out.println(check + " exists in array");
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println(check + " doesn't exist in the array");
        }

    }
}
