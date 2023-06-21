package ana_raetcaia;
import java.util.HashMap;
import java.util.Scanner;

public class Country {
//Create a class Country with parameters inside, name and capital. Create a Map that stores the abbreviator as keys and
// Country type as value. Add some pairs to the map and retrieve the capital of a specific country.
    String name;
    String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public static void main (String[]args) {

        Country countryObj = new Country("Ana","Moldova");
        System.out.println(countryObj.name +" from " + countryObj.capital + " lives...");

        Country countryObj1 = new Country("Ivan","Brazil");
        System.out.println(countryObj1.name +" from " + countryObj1.capital + " lives...");

        Country countryObj2 = new Country("Maria","Greece");
        System.out.println(countryObj2.name +" from " + countryObj2.capital + " lives...");


        Scanner sc = new Scanner(System.in);

        String userInput;
        System.out.println("Pick a name and write abbreviator: ");

        userInput = sc.nextLine().toUpperCase();

        HashMap<String, String[]> countries = new HashMap<>();
        countries.put("AM", new String[]{"Moldova", "Chisinau"});
        countries.put("IB", new String[]{"Brazil", "Brasilia"});
        countries.put("GRC", new String[]{"Greece", "Anthens"});

        System.out.println("in " + countries.get(userInput)[1]);
    }
}
