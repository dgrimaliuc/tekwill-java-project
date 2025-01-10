package main.java.cristinamocanu;

import java.util.ArrayList;
import java.util.HashMap;

public class Decembrie18{
public static void main (String[] args) {



//ArrayList<Integer> numbers = new ArrayList<>();
//numbers.add(4);
//numbers.add(2);
//numbers.add(8);
//numbers.add(10);
//for (int number : numbers);
//
//    System.out.println(numbers);
//
//    HashMap<String, String> CapitalCities = new HashMap<String, String>();
//    CapitalCities.put("England", "London");
//    CapitalCities.put("Germany", "Berlin");
//    CapitalCities.put("Norway", "Oslo");
//    CapitalCities.put("Usa", "Washington DC");
//
//    System.out.println(CapitalCities.get("England");


HashMap<String, Integer> people = new HashMap<String, Integer>();

    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);
    for (String i : people.keySet())
        System.out.println("key: " + i + "value: "  + people.get(i));
}}