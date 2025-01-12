package main.java.IonErm.HomeWork.errors;

public class Main {

    public static void devide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Not a Number");
        } finally {
            System.out.println("The Try Catch block finished");
        }
    }

    public static void printSecond() {
        int[] arr = {12};
        try {
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not Found");
        } finally {
            System.out.println("The Try Catch block finished");
        }
    }


    public static void parseInt(String string) {
        try {
            int number = Integer.parseInt(string);
            System.out.println("Success convert =  " + number);
        } catch (NumberFormatException e) {
            throw new PersonalNumberException("Impossible to parse int from string: " + string);
        }
    }

    public static void main(String[] args) {
        devide(3, 10);
        devide(10, 5);
        devide(10, 0);

        printSecond();

        parseInt("g");

    }
}
