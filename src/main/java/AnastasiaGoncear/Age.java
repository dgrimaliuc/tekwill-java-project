package AnastasiaGoncear;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;

        Scanner sc=new Scanner(System.in);
        System.out.println("Insert your age");
        age = sc.nextInt();

        if (age>=18) {
            System.out.print("You are adult");
        }
        else
            System.out.print("You are minor");
    }

}
