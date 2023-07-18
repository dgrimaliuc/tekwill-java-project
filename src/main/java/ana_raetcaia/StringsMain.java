package ana_raetcaia;

import java.util.Scanner;

public class StringsMain {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phrase: ");
        String phrase = sc.nextLine();

        System.out.println(phrase.length());
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.contains("lo"));
        System.out.println(phrase.replaceAll(" ",""));
        System.out.println(phrase.substring(0,2));


    }
}
