package Leas_Liudmila.Inheritance;

import java.util.HashMap;

public class CountryMain {
    public static void main(String[] args) {
        HashMap<String, Country> countries = new HashMap<>();
        countries.put("MD", new Country("Moldova", "Chisinau"));
        countries.put("USA", new Country("United States of America", "Washington"));
        countries.put("RO", new Country("Romania", "Bucharest"));
        countries.put("UA", new Country("Ukraine", "Kiev"));
        countries.put("UK", new Country("England", "London"));

        Country result = countries.get("USA");
        System.out.println(result.getCapital());
    }

}
