package Serghei_Stoianov;

public class WhileDoWhile {
    public static void main(String[] args) {
//Print numbers from 1 to 10 using a while-do loop.
        int i = 0;
        while (i++ < 10) {
            System.out.print(i + " ");

        }
        System.out.println();
//Calculate the sum of numbers from 1 to 100 using a do-while loop.
        i = 100;
        int sum = 0;
        do {
            sum = sum + i;
        } while (i-- > 0);
        System.out.println("the sum of numbers from 1 to 100 =" + sum);

//Print the even numbers from 1 to 20 using a while-do loop
        System.out.print("the even numbers from 1 to 20 are ");
        i = 0;
        while (i++ < 20)
            if (i % 2 == 0) System.out.print(i + " ");

    }
}
