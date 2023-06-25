package anna_gontari;


import java.util.HashMap;

//Create a class Country with parameters inside, name and capital. Create a Map that stores the abbreviation
// as keys and Country type as value. Add some pairs to the map and retrieve the capital of a specific country.
public class Countries {
    String name;
    String capital;
    public Countries(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public static void main(String[] args) {
        Countries CountriesObject = new Countries("Leonardo", "Rome");
        System.out.println(CountriesObject.name + " lives in " + CountriesObject.capital);
        Countries CountriesObject2 = new Countries("Lucia", "Madrid");
        System.out.println(CountriesObject2.name + " lives in " + CountriesObject2.capital);
        Countries CountriesObject3 = new Countries("Liam", "Brussels");
        System.out.println(CountriesObject3.name + " lives in " + CountriesObject3.capital);

        HashMap<String, String[]> countries = new HashMap<>();
        countries.put("IT", new String[]{"Italy", "Rome"});
        countries.put("SP", new String[]{"Spain", "Madrid"});
        countries.put("BE", new String[]{"Belgium", "Brussels"});

        System.out.println("Did you know, that Leonardo lives in " + countries.get("IT")[1] + "?");
    }
}
