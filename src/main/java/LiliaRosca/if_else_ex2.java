package main.java.LiliaRosca;

public class if_else_ex2 {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Numar pozitiv par");
            } else {
                System.out.println("Numar pozitiv impar");
            }
        } else if (num < 0) {
            System.out.println("Numar negativ");
        } else {
            System.out.println("Zero");
        }
    }
}
