package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.enums;

public enum Countries {

    USA("United States", "US");
    String countryName;

    String countryCode;

    Countries(String coutnryName, String countryCode) {
        this.countryName = coutnryName;
        this.countryCode = countryCode;
    }

    public static void main(String[] args) {
        System.out.println(Countries.USA.countryName);
        System.out.println(Countries.USA.countryCode);
    }
}
