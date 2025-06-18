package main.java.daniel_sontu;

public class MethodTwo {

    static String checkNumber(int number){
        if (number % 2 == 0) {
            return "Par";
        }else{
            return "Impar";
        }

    }
    public static void main(String[] args) {
        var result = checkNumber(1);
        System.out.println("Numarul este " + result);
    }

}
