package alexandr_samohvalov;

public class WhileDoMain {
    // Print numbers from 1 to 10 using a while-do loop.
    public static void printNum(String[] printNum) {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    //Calculate the sum of numbers from 1 to 100 using a do-while loop.
    public static void calSumOfNum(String[] calSumOfNum) {
        int i = 1;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= 100);
        System.out.println("Sum of num from 1 to 100 = " + sum);
    }

    //Print the even numbers from 1 to 20 using a while-do loop.
    public static void printEvenNumbers(String[] printEvenNumbers) {
        int i = 1;
        System.out.println("even numbers from 1 to 20:");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;

        }

    }
}
