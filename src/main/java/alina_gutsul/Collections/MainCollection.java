package alina_gutsul.Collections;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCollection {
    public static void main(String[] args) {
        List<DogCollection> dogs = new ArrayList<>();
        dogs.add(new DogCollection("Max", 3));
        dogs.add(new DogCollection("Bella", 5));
        dogs.add(new DogCollection("Charlie", 2));

        System.out.println("Dogs:");
        for (DogCollection dog : dogs) {
            System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge());
        }

        List<EmployeeCollection> employees = new ArrayList<>();
        employees.add(new EmployeeCollection("John", 30));
        employees.add(new EmployeeCollection("Jane", 35));
        employees.add(new EmployeeCollection("Mike", 40));

        System.out.println("\nEmployees:");
        for (EmployeeCollection employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
        }

        Map<String, CountryCollection> countryMap = new HashMap<>();
        countryMap.put("USA", new CountryCollection("United States", "Washington D.C."));
        countryMap.put("UK", new CountryCollection("United Kingdom", "London"));
        countryMap.put("IND", new CountryCollection("India", "New Delhi"));
        countryMap.put("MD", new CountryCollection("Moldova", "Chisinau"));

        String countryAbbreviation = "USA";
        CountryCollection country = countryMap.get(countryAbbreviation);
        if (country != null) {
            System.out.println("\nCapital of " + country.getName() + ": " + country.getCapital());
        } else {
            System.out.println("\nCountry abbreviation not found.");
        }
    }
}
