package dmitrii_tofan._HW_3;

import java.util.Enumeration;
import java.util.Scanner;

public class Break_Continue_Main {
    public static void main(String[] args) {

// 1.Create a program, which will ask user to enter a number, if number will be negative exit the loop

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a num: ");
            int num = sc.nextInt();
            if (num < 0)
            {
                break;
            }
            sum += num;
        }
        System.out.println("Сумма положительных чисел: " + sum);

// 2. Create a program which will print all number from 1 to 10 except 3 and 7 using continue keyword
//        int a = 1;
        for (int a = 0; a <= 10 ; a++) {
            if (a == 3 || a == 7) {
                continue;
            }
            System.out.println(a);
        }
    }
}
