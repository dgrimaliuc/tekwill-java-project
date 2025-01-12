

//public class Main {
//    public static void toUpperCase(String string) {
//        if (string == null) {
//            throw new PersonalNullException("String is null");
//        }
//        System.out.println(string.toUpperCase());
//
//    }
//
//    public static void main (String[] args) {
//
//       toUpperCase(String:null);
//}}

import java.util.Scanner;

public static void main(String[] args) {


  class PersonalNumberException extends RuntimeException{
        PersonalNumberException (String message){
            super(message);

        }
        PersonalNumberException (){
            super();
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number: ");
        String input = scanner.nextLine();

        try {
            int numar = Integer.parseInt(input);
            System.out.println("Number is: " + numar);
        } catch (NumberFormatException e) {
            throw new PersonalNumberException("Impossible to parse int from string" + input);
        }

        }



    }
}