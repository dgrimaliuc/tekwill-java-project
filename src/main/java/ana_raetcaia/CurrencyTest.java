package ana_raetcaia;
import static ana_raetcaia.Currency.USD;
public class CurrencyTest {
    public static void main(String[]args){
        System.out.println("Amount in EUR: " + Currency.EUR.convertExchange(7.87));
        System.out.println("Amount in USD: " + Currency.USD.convertExchange(34.82));
        System.out.println("Amount in GBP: " + Currency.GBP.convertExchange(787.8));





    }
}
