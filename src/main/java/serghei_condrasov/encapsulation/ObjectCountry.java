package serghei_condrasov.encapsulation;

import java.util.HashMap;
import java.util.Map;

public class ObjectCountry {

    /*Create a Map that stores the abbreviator as keys and Country type as value.
    Add some pairs to the map and retrieve the capital of a specific country.*/

    public static void main(String[] args) {

        Map<String, Country> countries = new HashMap<>();
        countries.put("MD", new Country("Moldova","Kishinev"));
        countries.put("GR", new Country("Greece","Athens"));
        countries.put("FR", new Country("France","Paris"));
        countries.put("IT", new Country("Italy","Rome"));

        System.out.print(countries.get("FR").getCapital());
    }
}
