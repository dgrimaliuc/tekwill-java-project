package ChirilBortnicov.ChirilB;

import java.util.*;

public class Task6 {
   /* Lists
    Create an array ArrayList of strings and add some fruits inside, print array list on screen
    Sets:
    Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
            Map
    Create a Map that stores the abbreviator as keys and names of countries as values. Add some pairs to the map and print content of map.
            countryMap.put(“USA”, “United States of America”);
       (“UK”, “United Kingdom”);
       (“CAN”, “Canada”);
       (“GER”, “Germany”);
       (“FRA”, “France”); */
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Plum");
        System.out.println(fruits);

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Tekwill");
        set.add("Project");
        set.add("JavaTekwillProject");
        String s1 = "Fruit";
        if (set.contains(s1)){
            System.out.println("Set contains fruit");
        } else {
            System.out.println("Set doesnt contains fruit");
        }

        Map<String, String> CountryMap = new HashMap<>();
        CountryMap.put("USA", "United States of America");
        CountryMap.put("UK", "United Kingdom");
        CountryMap.put("CAN", "Canada");
        CountryMap.put("GER", "Germany");
        CountryMap.put("FRA", "France");
        System.out.println(CountryMap);
    }
}
