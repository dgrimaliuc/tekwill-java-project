package alina_gutsul.enums;

public class MainEnum {
    public static void main(String[] args) {
        double amount = 100.0;
        Currency sourceCurrency = Currency.USD;
        Currency targetCurrency = Currency.EUR;

        double convertedAmount = sourceCurrency.convert(amount, targetCurrency);
        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
    }
}

