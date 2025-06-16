package main.java.NataliaChihai;

public class Animal {

    String nume;
    String tip;
    int varsta;
    String sunet;

    public Animal(String nume, String tip, int varsta, String sunet) {
        this.nume = nume;
        this.tip = tip;
        this.varsta = varsta;
        this.sunet = sunet;
    }
    public void afiseazaInfo() {
        System.out.println("Animal: " + nume + ", Tip: " + tip + ", varsta: " + varsta +", sunet: " + sunet );
    }
    public static void main(String[] args) {
        Animal a1 = new Animal("Nami", "Caine", 2, "hum");
        Animal a2 = new Animal("Haru", "Pisica", 5, "miau");
        Animal a3 = new Animal("Chirita", "Pisica", 5, "miau");

        a1.afiseazaInfo();
        a2.afiseazaInfo();
        a3.afiseazaInfo();
    }
}

