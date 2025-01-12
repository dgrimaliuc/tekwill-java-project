package main.java.iuliaNamolovan.IN_hm4;

import java.util.HashMap;

public class IN_hm42 {
    public static void main(String[] args) {
        HashMap<String, String> countryMap = new HashMap<String, String>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("DE", "Germania");
        countryMap.put("FRA", "France");
        System.out.println(countryMap.get("FRA"));
       /* for (String key : countryMap.keySet()) {
            System.out.println(key + ":" + countryMap.get(key));

        }*/
    }
}
