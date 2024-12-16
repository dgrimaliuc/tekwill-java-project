package main.java.JosanCristi;


import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        int num1 = 10, num2 = 12;
        int sum1 = num1 + num2;
        int sum2 = num1 - num2;
        int sum3 = num1 * num2;
        int sum4 = num1 / num2;
        int num3 = min(num1, num2);
        System.out.println(sum1 + "\n" + sum2 + "\n" + sum3 + "\n" + sum4);
        System.out.println(num3);
    }
}

