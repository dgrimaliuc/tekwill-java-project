package LiubovZapsa;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Создайте две переменные и найдите их сумму (+),
        разность (-), произведение (*) и частное (/) и выведете
         каждый результат на экран
        int num1 = 20;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println("summary two numbers equal: " + sum);
        int difference = num1 - num2;
        System.out.println("difference two numbers equal:" + difference);
        int product = num1 * num2;
        System.out.println("product of numbers equal: " + product);
        int quotient = num1 / num2;
        System.out.println("quotient of numbers equal: " + quotient);
    }
}
        //Выведите на экран наименьшее из двух чисел
        int num1 = 64;
        int num2 = 14;
        if (num1 > num2) {
            System.out.println("Min number:" + num2);
        } else {
            System.out.println("Min number:" + num1);
        }
    }
}
    // С помощью Scanner попросите пользователя ввести
        // свой возраст, если число больше либо равно
        // 18 выведите “Вы совершеннолетний” иначе “Вы
        // не совершеннолетний”
 */
        Scanner scanner = new Scanner(System.in);
        // enter age
        System.out.print("Please, enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не совершеннолетний");
        }
    }
}


