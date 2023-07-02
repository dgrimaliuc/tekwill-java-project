package Leas_Liudmila.enumsAndInterface;

//Create an enum called "Currency" that represents different currencies (e.g., USD, EUR, GBP).
//Add a method to the enum to convert an amount from one currency to another based on the current exchange rate.
public enum Currency {
    USD(1, 1.0947, 1.279),
    EUR(0.9135, 1, 1.1685),
    GBP(0.7818, 0.8558, 1 );

    private final double usd;
    private final double eur;
    private final double gbp;


    Currency(double usd, double eur, double gbp) {

        this.usd = usd;
        this.eur = eur;
        this.gbp = gbp;
    }

    public double calculateExchangeFromUSD(double amount) {
return amount*usd;
    }
    public double calculateExchangeFromEUR(double amount) {
        return amount*eur;
    }
    public double calculateExchangeFromGBP(double amount) {
        return amount*gbp;
    }

}


