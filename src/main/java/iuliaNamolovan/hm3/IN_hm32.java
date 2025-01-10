package main.java.iuliaNamolovan.hm3;

public class IN_hm32 {
    public static void main(String[] args) {
        //creaza un program care gaseste si afiseaza valoarea medie a tutror elementelor dintrun arrray de numere reale
        double[] ar = {1.1, 2.1, 3.1, 4.1, 5.1};
        double sum = 0;
        for (double num : ar) {
            sum += num;
        }
        double med = (double) sum / ar.length;
        System.out.println("media este " + med);
    }
}
//creaza un program care afiseaza un array de tip string , definit in cadrul programului