package main.java.Magda_Petrachi;

public class MP_method {

   //task 1
    public static void greet(){
        System.out.println("Hello wold");
    }

    //task 2
    public static int diferenta( int a, int b){
        return a-b;
    }

    //task 3
    public static int max(int x, int e, int q){
        return Math.max(x, Math.max(e, q));
    }

    //task 4
    public static int suma(Integer... numere) {
        int suma = 0;
        for (int n : numere) {
            suma += n;
        }
        return suma;
    }

    public static void main(String[] args) {
        greet();

        int dif = diferenta(10, 4);
        System.out.println("Diferenta este " + dif);

        int maxim = max(10, 30, 23);
        System.out.println("Numarul maxin este " + maxim);

        int total = suma(2, 4, 6, 12, 45, 55);
        System.out.println("Suma totala este " + total);
    }

}
