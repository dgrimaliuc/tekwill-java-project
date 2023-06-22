package serghei_condrasov;

public class WhileDo {
    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10 using a while-do loop.
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        // 2. Calculate the sum of numbers from 1 to 100 using a do-while loop.
        int a = 0;
        int sum = 0;
        do {
            a++;
            sum = sum + a;
        } while (a < 100);
        System.out.println("\n" + "Sum of numbers from 1 to 100 = " + sum);

        // 3. Print the even numbers from 1 to 20 using a while-do loop.
        int b = 1;
        while (b < 20) {
            if (b % 2==0) {
                System.out.print(b + " ");
            }
            b++;
        }
    }
}
