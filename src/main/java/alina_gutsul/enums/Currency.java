package alina_gutsul.enums;

public enum Currency {
    USD(1.0), // United States Dollar
    EUR(0.85), // Euro
    GBP(0.75); // British Pound

    private double exchangeRate; // Exchange rate relative to USD

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
