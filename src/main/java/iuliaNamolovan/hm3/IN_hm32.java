package main.java.iuliaNamolovan.hm3;

public class IN_hm32 {
    public static void main(String[] args) {
        //creaza un program care gaseste si afiseaza valoarea medie a tutror elementelor dintrun arrray de numere reale
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double med = (double) sum / array.length;
        System.out.println("media este " + med);
    }
}
//creaza un program care afiseaza un array de tip string , definit in cadrul programului