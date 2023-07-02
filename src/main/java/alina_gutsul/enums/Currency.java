package alina_gutsul.enums;

public enum Currency {
    USD(1.0),
    EUR(0.85),
    GBP(0.75);

    private double exchangeRate;

    Currency(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public double convert(double amount, Currency targetCurrency) {
        return amount * (targetCurrency.getExchangeRate() / this.exchangeRate);
    }
}
