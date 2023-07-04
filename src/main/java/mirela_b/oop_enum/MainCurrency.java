package mirela_b.oop_enum;

import java.util.Scanner;

public class MainCurrency {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Currency initialCurrency;
        Currency toConvertCurrency;

        System.out.println("Enter current amount");
        int amount = userInput.nextInt();
        System.out.println("Enter the current currency");
        initialCurrency = selectCurrency();
        System.out.println("Enter the currency to convert");
        toConvertCurrency = selectCurrency();

        System.out.println(amount + " = " + initialCurrency.convertAmount(amount, toConvertCurrency));
    }

    public static Currency selectCurrency() {
        int option;
        Currency currency = null;
        System.out.println("Select the currency");
        System.out.println("1) USD");
        System.out.println("2) EUR");
        System.out.println("3) GPB");
        option = userInput.nextInt();

        switch (option) {
            case 1:
                currency = Currency.USD;
                break;
            case 2:
                currency = Currency.EUR;
                break;
            case 3:
                currency = Currency.GBP;
                break;
            default:
                System.out.println("No such an option");
                break;
        }
        return currency;
    }
}