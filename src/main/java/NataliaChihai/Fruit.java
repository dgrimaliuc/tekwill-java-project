package main.java.NataliaChihai;

public class Fruit {
    String nume;
    String culoare;
    int calorii;

    public Fruit(String nume, String culoare, int calorii) {
        this.nume = nume;
        this.culoare = culoare;
        this.calorii = calorii;
    }

    public void afiseazaInfo() {
        System.out.println("Fruct: " + nume + ", Culoare: " + culoare + ", calorii: " + calorii );
    }
    public static void main(String[] args) {
        Fruit f1 = new Fruit("mar", "rosu", 78);
        Fruit f2 = new Fruit("banana", "galben", 95);
        Fruit f3 = new Fruit("cirese", "rosu", 78);

        f1.afiseazaInfo();
        f2.afiseazaInfo();
        f3.afiseazaInfo();
    }
}
