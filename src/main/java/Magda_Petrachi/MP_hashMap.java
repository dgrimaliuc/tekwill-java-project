package main.java.Magda_Petrachi;

import java.util.HashMap;
//task 3
public class MP_hashMap {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<String, String>();

        country.put("USA", "United States of America");
        country.put("UK", "United Kingdom");
        country.put("CAN", "Canada");
        country.put("GER", "Germany");
        country.put("FRA", "France");
        System.out.println(country);
    }
}
