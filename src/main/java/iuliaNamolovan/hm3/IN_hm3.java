package main.java.iuliaNamolovan.hm3;

public class IN_hm3 {
    public static void main(String[] args) {

        //calculeaza suma numerelor de la 55 la 101 folosind o bucla do while
        int num = 55;
        int fin = 101;
        int sum = 0;
        do {
            sum += num; // adauga valoarea curenta la suma
            num++;// incrementare
        } while (num <= fin);
        System.out.println("suma numerelor de la 55 pana la 101 este:" + sum);
    }
}

