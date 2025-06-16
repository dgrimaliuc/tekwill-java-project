package main.java.denis_grimaliuc.inheritance;


/**
 * Creează o clasă numită “Calculator” cu metode supraincarcate pentru adunare.
 * Implementează metode care pot aduna două numere întregi, două numere cu virgulă mobilă
 * și un număr întreg cu un număr cu virgulă mobilă.
 */
public class Calculator {

    //  aduna două numere întregi,
    public static int add(int a, int b) {
        return a + b;
    }

    // două numere cu virgulă mobilă
    public static double add(double a, double b) {
        return a + b;
    }

    // un număr întreg cu un număr cu virgulă mobilă
    public static double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(100, 200));

    }

}
