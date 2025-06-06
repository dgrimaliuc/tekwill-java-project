package main.java.daniel_sontu;

public class While1to10 {
//    public static void main(String[] args) {
//
//        int count =0;
//        while (count<=10){
//            System.out.println(count);
//            count++;
//        }
//    }
//}

    public static void main(String[] args) {
        //Scrie un program care afiseaza toate numerele pare de la 0 la 59 folosind while
        int count = 1;
        while (count <= 50) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
