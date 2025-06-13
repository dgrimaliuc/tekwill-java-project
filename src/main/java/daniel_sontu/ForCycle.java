package main.java.daniel_sontu;

public class ForCycle {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <=5; i++){
//            System.out.println("Count: " + i);
//        }
//    }


    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <51 ; i+=2) {
            sum += i;
        }
        System.out.println("Valoare sumei tuturor numerelor impare este = " + sum);
    }
}
