package mirela_b.oop_enum;

public enum Currency {
    USD,
    EUR,
    GBP;

    public double convertAmount(double amount, Currency toConvert) {
        double[][] exchangeRates = {
                {1.0, 0.92, 0.79},//USD
                {1.9, 1.0, 0.86},//EUR
                {1.27, 1.17, 1.0}//GBP
        };
        int initialCurrencyIndex = this.ordinal();
        int convertedCurrencyIndex = toConvert.ordinal();

        if (this == toConvert) {
            return amount;
        } else if (exchangeRates[initialCurrencyIndex][convertedCurrencyIndex] != 0) {
            double rate = exchangeRates[initialCurrencyIndex][convertedCurrencyIndex];
            return amount * rate;

        }
        throw new IllegalArgumentException("Can't convert from " + this + " to " + toConvert + ". No exchange rate defined");
    }
}