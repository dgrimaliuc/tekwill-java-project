package main.java.denisGrimaliuc.lect8;


/*

Creează o clasă numită “Calculator” cu metode supraincarcate pentru adunare.
 Implementează metode care pot aduna două numere întregi,
două numere cu virgulă mobilă și un număr întreg cu un număr cu virgulă mobilă.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public int add(int... a) {
        int sum = 0;

        for (int i : a) {
            sum = sum + i;
        }

        return sum;
    }
}
