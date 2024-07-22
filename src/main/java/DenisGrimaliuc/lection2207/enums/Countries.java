package DenisGrimaliuc.lection2207.enums;

public enum Countries {

    USA("United States", "US");

    String countryName;
    String countryCode;

    Countries(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public static void main(String[] args) {
        System.out.println(Countries.USA.countryName);
        System.out.println(Countries.USA.countryCode);
    }
}
