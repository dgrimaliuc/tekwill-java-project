package Leas_Liudmila.enumsAndInterface;

public class CurrencyMain {
    public static void main(String[] args) {
        for (Currency curr : Currency.values()) {
            System.out.println(curr + ": " + curr.calculateExchange(100));

        }
    }
}
