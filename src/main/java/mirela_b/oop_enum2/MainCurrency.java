package mirela_b.oop_enum2;

import java.util.Scanner;

public class MainCurrency {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Currency initialCurrency;
        Currency toConvertCurrency;

        System.out.println("Enter the current currency");
        initialCurrency = selectCurrency();
        System.out.println("Enter current amount");
        int amount = userInput.nextInt();
        System.out.println("Enter the currency to convert");
        toConvertCurrency = selectCurrency();

        if(initialCurrency == Currency.MDL){
            System.out.println(amount + " = " + initialCurrency.convertFromMDL(amount,toConvertCurrency));
        }
        else{
            System.out.println(amount + " = " + Currency.MDL.convertFromMDL(initialCurrency.convertToMDL(amount),toConvertCurrency));
        }
    }

    public static Currency selectCurrency() {
        int option;
        Currency currency = null;
        System.out.println("Select the currency");
        System.out.println("1) USD");
        System.out.println("2) EUR");
        System.out.println("3) GPB");
        System.out.println("4) MDL");
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
            case 4:
                currency = Currency.MDL;
                break;
            default:
                System.out.println("No such an option");
                break;
        }
        return currency;
    }
}

