package Leas_Liudmila.exceptions;

import java.util.Scanner;

//Create personal Checked exception with name "ParseToIntException" and method which throws this exception if a string
//provided as parameter can not be converted to int with Integer.parseToInt() method.
public class MyNewException {
    public static void convert2(String a) throws MyException {

        try {
            int b = Integer.parseInt(a);
            System.out.println(b);

        } catch (NumberFormatException e) {
            throw new MyException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your String:");
        String a = userInput.nextLine();

        try {
            convert2(a);
        } catch (MyException e) {
            System.out.println("MyException is caught");
        }

    }

}
