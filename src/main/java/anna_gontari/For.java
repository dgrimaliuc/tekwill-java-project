package anna_gontari;

public class For {
    public static void main(String[] args) {
        //Print numbers from 1 to 10 using a for loop
        System.out.println("Output is : ");
        for(int a = 1; a <= 10; a++)
        {
            System.out.println(a);
        }

        //Calculate the sum of numbers from 1 to 100 using a for loop.
        int num = 100, sum = 0;
        for(int b = 1; b <= num; ++b)
        { sum += b;
        }
        System.out.println("Sum = " + sum);

        //Calculate the factorial of a given number using a for loop
        int factorial = 1;
        for (int c = 1; c<=4; c++) {
            factorial*= c;
        }
        System.out.println(factorial);
    }
}
