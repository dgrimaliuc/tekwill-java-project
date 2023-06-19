package alina_gutsul;

public class WhileDoDoWhile {
    public static void main(String[] args) {
        //Print numbers from 1 to 10 using a while-do loop.
        System.out.println("1. Print numbers from 1 to 10 using a while-do loop");
        int i = 1;
        while(i <= 10)
        {
            System.out.print(i + " " );
            i++;
        }

        //Calculate the sum of numbers from 1 to 100 using a do-while loop.
        System.out.println("\n\n2. Calculate the sum of numbers from 1 to 100 using a do-while loop.");
        int sum = 0;
        int j = 1;
        do {
            sum += j;
            j++;
        } while (j <= 100);
        System.out.println("Sum: " + sum);

        //Print the even numbers from 1 to 20 using a while-do loop.For
        System.out.println("\n3. Print the even numbers from 1 to 20 using a while-do loop.");
        int k = 1;
        while (k <= 20) {
            if (k % 2 == 0) {
                System.out.print(k + " " );
            }
            k++;
        }
    }
}

