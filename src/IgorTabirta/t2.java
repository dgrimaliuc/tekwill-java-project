package IgorTabirta;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        // 1. Найдите сумму
        int sum = a + b;
        System.out.println("Сумма: " + sum);
        // 2. Найдите разность
        int diff = a - b;
        System.out.println("Разность: " + diff);
        // 3. Произведение
        int mult = a * b;
        System.out.println("Произведение: " + mult);
        // 4. Частное
        double div = (double) a / b;
        System.out.println("Частное: " + div);
        // 5. Найдите минимальное значение
        if (a < b) {
            System.out.println("Минимальное значение: a ");
        } else {
            System.out.println("Минимальное значение: b");
        }
        // 6. пользователя ввести свой возраст, если число больше либо равно
        // 18 выведите “Вы совершеннолетний” иначе “Вы не совершеннолетний”
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите ваш возраст:");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы слишком молоды ");
        }

    }
}
