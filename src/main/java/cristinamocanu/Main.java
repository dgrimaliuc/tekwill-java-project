package main.java.cristinamocanu;

import main.java.cristinamocanu.exceptions.PersonalNumberException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("./index.txt");

        // Exercitiu 1
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("File already exists");
        }

        // Exercitiu 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        String input = scanner.nextLine();

        try {
            int numar = Integer.parseInt(input);
            System.out.println("Number is: " + numar);
        } catch (NumberFormatException e) {
            throw new PersonalNumberException ("Impossible to parse int from string: " + input);
        } finally {
            scanner.close();
        }
    }
//    Exercitiu 3
public class ArithmeticExceptionExample extends Exception {
    // Creează o metodă „divide” și afișează rezultatul.
    // Captură o ArithmeticException și afișează „Not a Number”.
    public static int divide(int a, int b) {
        System.out.println(a / b);
        try {
            int result = divide(20, 0);
            System.out.println("Result:" + result);
        }
        catch (ArithmeticException e){
            System.out.println("Not a number");
        }
        return a /b;
    }  }
//Exercitiul 4



    public static void printSecond(int[] arr) {
       try {
        System.out.println(arr [1]);
    } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Not found");
       } }

//    void printSecond(new int [4]){

    }




