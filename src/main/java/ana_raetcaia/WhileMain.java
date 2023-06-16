package ana_raetcaia;

public class WhileMain {
    public static void main (String[]args){
        //1. Print numbers from 1 to 10 using a while-do loop.
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        //2. Calculate the sum of numbers from 1 to 100 using a do-while loop.
        int sum = 0;
        int j = 0;
        do {
            sum+=j;
            j++;
        }while(j<=100);
        System.out.println("Sum of numbers from 1 to 100:" + sum);

       // 3. Print the even numbers from 1 to 20 using a while-do loop.
        int x = 0;
        while(x<=20){
            System.out.println(x);
            x+=2;
        }
    }
}
