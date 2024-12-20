package main.java.cristinamocanu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TemaCollection {
    public static void main(String[] args) {
//
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (String i : cars) {
//            System.out.println(i);
//        }


//
//Creează un array ArrayList de șiruri de caractere și
// adaugă câteva fructe în acesta, apoi afișează lista pe ecran.

//        ArrayList<String> caracter = new ArrayList<String>();
//
//caracter.add("Bannana");
//caracter.add("Cerry");
//caracter.add ("Apple");
//caracter.add("Orange");
//for (String fruit : caracter) {
//
//
//            System.out.println(fruit);




//      Creează un Set de șiruri de caractere și adaugă câteva nume în acesta.
//      Afișează dimensiunea Set-ului și verifică dacă un anumit nume există în Set.


//        HashSet<String> nume = new HashSet<String>();
//        nume.add ("Ion");
//        nume.add ("Emilia");
//        nume.add ("Daniel");
//        nume.add ("Diana");
//nume.size();
//        System.out.println("Dimensiunea set-lui:  " + nume.size());
//
//boolean verifica = nume.contains("Alina");
//    System.out.println("Numele exista: " + verifica);
//        System.out.println(nume);


//
//        Creează un Map care stochează abrevierile ca chei și numele țărilor ca valori.
//        Adaugă câteva perechi în map și recuperează capitala unei țări specifice.


        HashMap<String, String> countryMap = new HashMap<String, String> ();
        countryMap.put ("UK", "United Kingdom");
        countryMap.put ("Can", "Canada");
        countryMap.put ("Ger", "Germany");
        countryMap.put ("Fra", "France");
        countryMap.put ("USA", "United States of America");


        for (String i : countryMap.keySet())
            System.out.println("key: " + i +  "value: "  + countryMap.get(i));

        String country = countryMap.get("Fra");
        System.out.println("Capitala Fra este: " + country);
}

    }


