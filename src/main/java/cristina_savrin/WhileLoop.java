package cristina_savrin;

public class WhileLoop {

    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10 using a while-do loop.
        int i = 1;
        System.out.print("1. Numbers from 1 to 10: ");
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        // 2. Calculate the sum of numbers from 1 to 100 using a do-while loop.
        int j = 1, sum = 0;
        do {
            sum += j;
            j++;
        }
        while (j <= 100);
        System.out.print("\n2. Sum of numbers from 1 to 100: " + sum);

        // 3. Print the even numbers from 1 to 20 using a while-do loop.
        int k = 1;
        System.out.print("\n3. List of even numbers from 1 to 20: ");
        while (k <= 20) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k++;
        }
    }
}