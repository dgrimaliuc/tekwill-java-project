package ana_raetcaia;

public enum Currency {
    //Create an enum called "Currency" that represents different currencies (e.g., USD, EUR, GBP).
    // Add a method to the enum to convert an amount from one currency to another based on the current exchange rate.
    //at least please create Enum with USD, EUR, GBP to know how to create it.

    USD(17.95),
    EUR(19.60),
    GBP(22.20);

    private double exchange;
    double amount;

    Currency(double exchange){
        this.exchange = exchange;

    }
   //I was trying to write a programme that would make (an amount from one currency to another)
   // but it failed and I wrote a programme that would just convert the currency.
    public double convertExchange(double amount){
     double convertExchange = amount * this.exchange;
     return Math.round(convertExchange);

    }


}
