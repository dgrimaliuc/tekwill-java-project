package Leas_Liudmila.Inheritance;

//Create a class Country with parameters inside, name and capital.
// Create a Map that stores the abbreviation as keys and Country type as value.
// Add some pairs to the map and retrieve the capital of a specific country.
public class Country {
    private String name;
    private String capital;

    public Country(String name, String capital) {
        setName(name);
        setCapital(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

}
