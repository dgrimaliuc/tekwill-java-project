package alina_gutsul.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dogs:");
        printDogs();

        System.out.println("\nEmployees:");
        printEmployees();

        String countryAbbreviation = "USA";
        printCountryCapital(countryAbbreviation);
    }

    public static void printDogs() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Max", 3));
        dogs.add(new Dog("Bella", 5));
        dogs.add(new Dog("Charlie", 2));
        for (Dog dog : dogs) {
            System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge());
        }
    }

    public static void printEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30));
        employees.add(new Employee("Jane", 35));
        employees.add(new Employee("Mike", 40));

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
        }
    }

    public static void printCountryCapital(String countryAbbreviation) {
        Map<String, Country> countryMap = new HashMap<>();
        countryMap.put("USA", new Country("United States", "Washington D.C."));
        countryMap.put("GBR", new Country("United Kingdom", "London"));
        countryMap.put("IND", new Country("India", "New Delhi"));
        countryMap.put("AUS", new Country("Australia", "Canberra"));

        Country country = countryMap.get(countryAbbreviation);
        if (country != null) {
            System.out.println("\nCapital of " + country.getName() + ": " + country.getCapital());
        } else {
            System.out.println("\nCountry abbreviation not found.");
        }
    }
}
