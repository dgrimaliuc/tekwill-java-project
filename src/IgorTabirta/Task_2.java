package IgorTabirta;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        // 1. Арифметические действия
        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        double div = (double) a / b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiply: " + mult);
        System.out.println("Divide: " + div);
        // 2. Определение минимального значения
        if (a < b) {
            System.out.println("a -> MIN");
        } else {
            System.out.println("b -> MIN");
        }
        // 3. Запрос пользователя ввести свой возраст + условие
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type yr age: ");
        age = Integer.parseInt(sc.nextLine());
        if (age >= 18) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are Teenager");
        }
    }
}
