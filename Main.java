package IvanTrembaci;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 1
        int x = 10, y = 11;
        System.out.println(x + y);
        //2
        if (x == y) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
        //3
        if (x > 0) {
            System.out.println("Number is > then 0");
        } else if (x < 0) {
            System.out.println("Number is < then 0");
        } else {
            System.out.println("Number is == zero");
        }
        //4
        int a = 6,b = 3, c = 19;
        if (a > b && a > c){
            System.out.println("Max is A");
        } else if (b > a && b > c){
            System.out.println("Max is B");
        } else {
            System.out.println("Max is C");
        }

        //5 + 6
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите свое имя");
        String name = in.nextLine();
        System.out.println("Введите фамилию");
        String surName = in.next();
        System.out.println("Привет " + name + " " + surName);
    }
}

