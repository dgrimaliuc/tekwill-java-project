package main.java.georgeVinaga.Learn_10_01_2025.ClassWork;

public class Example {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom exception occurred!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
