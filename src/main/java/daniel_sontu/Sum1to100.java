package main.java.daniel_sontu;

public class Sum1to100 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;


        while (count<= 100){
            sum += count;
            count+= 2;
        }
        System.out.println("Suma numerelor pare de la 0 la 100 este = " +sum);
    }
}
