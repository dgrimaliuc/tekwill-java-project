package main.java.iuliaNamolovan.hm2;

public class IN_hm2_1 {
    public static void main(String[] args) {
        int var1 = 14;
        int var2 = -3;
        int sum = var1 & var2;
        int prd = var1 * var2;
        int imp = var1 % var2;
        System.out.println("Suma celor doua variabile este :\n " + sum);
        System.out.println("Produsul celor doua variabile este :\n " + prd);
        System.out.println("Catul celor doua variabile este :\n " + imp);
        if (var1 >= var2) {
            System.out.println("Cea mai mare valoare o are variabila 1:\n" + var1);
        } else
            System.out.println("Cea mai mare valoare o are variabila 2:\n" + var2);
    }
}
