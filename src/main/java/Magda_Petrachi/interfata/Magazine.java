package main.java.Magda_Petrachi.interfata;

public class Magazine implements Printable {
    String nume;
    String proprietar;

    public Magazine(String nume, String proprietar) {
        this.nume = nume;
        this.proprietar = proprietar;
    }

    @Override
    public String toString() {
        System.out.println("Nume " + nume + "proprietar" + proprietar);
        return "";
    }
}
