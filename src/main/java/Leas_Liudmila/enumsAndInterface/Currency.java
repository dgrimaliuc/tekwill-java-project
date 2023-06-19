package Leas_Liudmila.enumsAndInterface;

//Create an enum called "Currency" that represents different currencies (e.g., USD, EUR, GBP).
//Add a method to the enum to convert an amount from one currency to another based on the current exchange rate.
public enum Currency {
    USD(17.9255),
    EUR(19.6222),
    GBP(22.9276);

    private final double curs;

    Currency(double curs) {
        this.curs = curs;
    }

    public double calculateExchange(double lei) {
        return lei / curs;
    }
}


