package Leas_Liudmila;

import java.util.HashMap;

public class Map {

    //1. Create a Map that stores the abbreviation as keys and names of countries as values. Add some pairs to the map and retrieve the capital of a specific country.
    public static void main(String[] args) {
        HashMap<String, String> countryCodes = new HashMap<>();
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Romania", "Bucharest");
        countryCapitals.put("Moldova", "Chisinau");

        countryCodes.put("RO", "Romania");
        countryCodes.put("MD", "Moldova");

        String moldovaCapital = countryCapitals.get(countryCodes.get("MD"));

        System.out.println(moldovaCapital);
    }



}
