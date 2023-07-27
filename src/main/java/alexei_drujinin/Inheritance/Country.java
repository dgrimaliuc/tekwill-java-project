package alexei_drujinin.Inheritance;

public class Country {
String name;
String capital;

    public Country(String name, String capital){
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
