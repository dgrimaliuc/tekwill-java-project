package LiubovZapsa;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        for (String key : countryMap.keySet()) {
            System.out.println(key + " - " + countryMap.get(key));

        }
    }
}







