package src.main.java.Leas_Liudmila;


public class whileDo {
    public static void main(String[] args) {
        printNumbers();
        sumNumbers();
        evenNum();
        evenNum2();
    }

    //1. Print numbers from 1 to 10 using a while-do loop.
    public static void printNumbers() {
        int i = 1;
        while (i <= 10) {
            System.out.print(String.format("%d, ", i));
            i++;
        }
    }

    //2. Calculate the sum of numbers from 1 to 100 using a do-while loop.
    public static void sumNumbers() {
        int i = 1;
        int sum = 0;
        do {
            sum = i + sum;
            i++;
        }
        while (i <= 100);
        System.out.println("\n" + sum);
    }

    //3. Print the even numbers from 1 to 20 using a do-while loop.

    public static void evenNum() {
        int i = 1;
        do {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }

    //4. Print the even numbers from 1 to 20 using a while-do loop.
    public static void evenNum2() {
        int i = 1;
        while (i <= 20) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
