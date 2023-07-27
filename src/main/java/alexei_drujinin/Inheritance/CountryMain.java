package alexei_drujinin.Inheritance;

import java.util.HashMap;

public class CountryMain {
    public static void main(String[] args) {
            HashMap<String,Country> countries = new HashMap<>();
            countries.put("MD", new Country("Moldova", "Chisinau"));
            countries.put("UA", new Country("Ukraine", "Kiev"));
            countries.put("RU", new Country("Russia", "Moscow"));
            countries.put("RO", new Country("Romania", "Bucharest"));
            countries.put("TR", new Country("Turkish", "Istanbul"));


            Country result = countries.get("TR");
        System.out.println(result.getCapital());
        }
    }

