package Leas_Liudmila;

import java.util.HashMap;

public class Map {

    //1. Create a Map that stores the abbreviation as keys and names of countries as values. Add some pairs to the map and retrieve the capital of a specific country.
    public static void main(String[] args) {
        java.util.Map<String, String[]> countries = new HashMap<>();
        countries.put("MD", new String[]{"Moldova", "Chisinau"});
        countries.put ("RO", new String[]{"Romania", "Bucharest"});
        countries.put ("USA", new String[]{"America", "Washington"});
        System.out.println(countries.get("USA")[1]);



       /* HashMap<String, String> countryCodes = new HashMap<>();
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Romania", "Bucharest");
        countryCapitals.put("Moldova", "Chisinau");

        countryCodes.put("RO", "Romania");
        countryCodes.put("MD", "Moldova");

        String moldovaCapital = countryCapitals.get(countryCodes.get("MD"));

        System.out.println(moldovaCapital); */
    }



}
