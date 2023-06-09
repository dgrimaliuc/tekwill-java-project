package dmitrii_tofan._HW_3;

public class While_do_Do_Wile_Main {
    public static void main(String[] args) {
// 1. Print numbers from 1 to 10 using a while-do loop.
        int a = 1;
        while (a <= 10) {
            System.out.println("a= " + a);
            a++;
        }
// 2. Calculate the sum of numbers from 1 to 100 using a do-while loop.
        int b = 0;
        int sum = 0;
        while (b <= 100) {
            sum += b;
            b ++;
        }
        System.out.println("Сумма чисел от 1 до 100 = " + sum);

        System.out.println("-------------------------------------------------------------");

// 3. Print the even numbers from 1 to 20 using a while-do loop.
        int c = 1;
        while (c <= 20) {
            if (c % 2 == 0) {
                System.out.println("Even numbers: " + c);
            }
            c++;
        }
    }
        }



