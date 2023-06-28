package alexandr_samohvalov.Collections;

import java.util.HashMap;
import java.util.Map;
//Create a class Country with parameters inside, name and capital.
// Create a Map that stores the abbreviator as keys and Country type as value.
// Add some pairs to the map and retrieve the capital of a specific country.

public class CountryMain {
    public class Country {
        private String name;
        private String capital;

        public Country(String name, String capital) {
            this.name = name;
            this.capital = capital;
        }

        public String getName() {
            return name;
        }

        public String getCapital() {
            return capital;
        }

        public void main(String[] args) {
            Map<String, Country> countryMap = new HashMap<>();


            Country country1 = new Country("United States", "Washington D.C.");
            Country country2 = new Country("United Kingdom", "London");
            Country country3 = new Country("France", "Paris");

            countryMap.put("USA", country1);
            countryMap.put("UK", country2);
            countryMap.put("FRA", country3);


            String countryAbbreviation = "USA";
            Country specificCountry = countryMap.get(countryAbbreviation);

            if (specificCountry != null) {
                System.out.println("Capital of " + specificCountry.getName() + ": " + specificCountry.getCapital());
            } else {
                System.out.println("Country not found.");
            }
        }
    }
}
