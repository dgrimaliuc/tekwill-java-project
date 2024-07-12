package IvanTrembaci;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1
        int a = 50, b = 5;
        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println(("A / B = " + (a / b)));

        //2
        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        //3
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = in.nextInt();
            if (age >= 18 && age <= 100) {
                System.out.println("Вы совершеннолетний");
            } else if (age < 18 && age >= 0) {
                System.out.println("Вы не совершеннолетний");
            } else {
                System.out.println("Вы ввели неверное значение");
            }
        }
    }
