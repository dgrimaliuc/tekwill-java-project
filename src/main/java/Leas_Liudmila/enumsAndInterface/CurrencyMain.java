package Leas_Liudmila.enumsAndInterface;

public class CurrencyMain {
    public static void main(String[] args) {
        for (Currency curr : Currency.values()) {
            System.out.println("Currency exchange from USD to " + curr + ": " + Math.round(curr.calculateExchangeFromUSD(100)*100.0)/100.0);
        }
        for (Currency curr : Currency.values()) {
            System.out.println("Currency exchange from EUR to " + curr + ": " + Math.round(curr.calculateExchangeFromEUR(100)*100.0)/100.0);
        }
        for (Currency curr : Currency.values()) {
            System.out.println("Currency exchange from GBP to " + curr + ": " + Math.round(curr.calculateExchangeFromGBP(100)*100.0)/100.0);

        }
    }
}
