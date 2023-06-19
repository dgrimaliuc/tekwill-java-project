package roman_marcov;

public class DoWhile_WhileDo {
    public static void main(String[] args) {
        rangeNumber();
        sumNumber();
        evenNumber();

    }


    //        While-do and Do-while:
    //#1. Print numbers from 1 to 10 using a while-do loop.
    public static void rangeNumber() {

        int i = 1;
        do {
            System.out.printf(" " + i);
            i++;
        } while (i <= 10);
    }

    //#2. Calculate the sum of numbers from 1 to 100 using a do-while loop.
    public static void sumNumber() {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
        } while (i++ < 100);
        System.out.printf("\n " + sum);

    }

    //#3. Print the even numbers from 1 to 20 using a while-do loop.
    public static void evenNumber() {
        int n = 20;
        int i = 1;
        System.out.print("\nEven numbers from 1 to 20: ");
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
            }
            i++;
        }
    }

}
