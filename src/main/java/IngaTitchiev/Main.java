package IngaTitchiev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1=36;
        int num2=12;
        int num3=34;
        int sum,dif, prod;
        float del;
        //Создайте две переменные и найдите их
        // сумму (+), разность (-), произведение (*) и частное (/) и выведете каждый результат на экран
        sum=num1+num2;
        dif=num1-num2;
        prod=num1*num2;
        del=num1/num2;
        System.out.println("Sum= "+sum);
        System.out.println("Difference= "+dif);
        System.out.println("Product = "+prod);
        System.out.println("Delenie= "+del);
        //Выведите на экран наименьшее из двух чисел
        if (num1<num2) System.out.println("Min= "+num1);
        else System.out.println("Min= "+num2);
        //С помощью Scanner попросите пользователя ввести свой возраст,
        // если число больше либо равно 18 выведите “Вы совершеннолетний” иначе “Вы не совершеннолетний”
        String age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(age): ");
        age = sc.nextLine();
        int number = Integer.parseInt(age);
        if (number<18) System.out.println("you are a child");
        else System.out.println("You are mature");

    }
}
