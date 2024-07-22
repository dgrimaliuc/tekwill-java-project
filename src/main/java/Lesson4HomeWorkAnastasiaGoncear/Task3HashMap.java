package Lesson4HomeWorkAnastasiaGoncear;

import java.util.HashMap;

public class Task3HashMap {
    public static void main(String[] args) {
        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        countryMap.put("ITA", "Italy");
        for (HashMap.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println(" Country: " + entry.getValue());
    }
}}
