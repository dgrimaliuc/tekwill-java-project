package UlianaScolnicova;

import java.util.Scanner;

public class Lesson_Auto2 {
    public static void main(String[] args) {

        System.out.println("-----Task №1-----");

        //-----Ask user to enter his firstName, then lastName. Print Your full name is + firstName lastName-----//

        String firstName;
        String lastName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = sc.nextLine();
        System.out.println("Enter your last name: ");
        lastName = sc.nextLine();
        System.out.println("Your full name is: " + firstName + " " + lastName);


        //Создайте две переменные и найдите их сумму (+), разность (-), произведение (*) и частное (/)
        // и выведете каждый результат на экран
        System.out.println("\n-----Task №2-----");
        int a = 30;
        int b = 10;
        int sumAB = a + b;
        System.out.println(a + " + " + b + " = " + sumAB);

        int subAB = a - b;
        System.out.println(a + " - " + b + " = " + subAB);

        int multiAB = a * b;
        System.out.println(a + " * " + b + " = " + multiAB);

        int divAB = a / b;
        System.out.println(a + " / " + b + " = "  + divAB);

        //Выведите на экран наименьшее из двух чисел
        System.out.println("\n-----Task №3-----");
        if (a > b){
            System.out.println("b наименьшее число");
        } else if (a < b) {
            System.out.println("b наименьшее число");
        }else {
            System.out.println("a = b");
        }

        //С помощью Scanner попросите пользователя ввести свой возраст, если число больше либо равно 18 выведите
        // “Вы совершеннолетний” иначе “Вы не совершеннолетний”
        System.out.println("\n-----Task №4-----");
        int age;
        System.out.println("Введите ваш возраст: ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else if (age <= 0) {
            System.out.println("Возраст введен не корректно");
        }else{
            System.out.println("Вы несовершеннолетний");
        }

    }
}