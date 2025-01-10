package main.java.iuliaNamolovan.IN_hm4;

import java.util.HashSet;
import java.util.Set;

public class IN_hm41 {
    public static void main(String[] args) {
        Set<String> country = new HashSet<>();
        country.add("Moldova");
        country.add("Germania");
        country.add("Polonia");
        System.out.println("Lungimea setului este " + country.size());
        System.out.println("Se afiseaza elementele din set:");
        for (String countries : country) {

            System.out.println(countries);
        }
        if (country.contains("Moldova")) {
            System.out.println("In setul dat este Moldova");
        } else System.out.println("In setul dat nu  este Moldova");

    }
}
