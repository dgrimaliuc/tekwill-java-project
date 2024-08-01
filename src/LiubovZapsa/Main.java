package LiubovZapsa;

import LiubovZapsa.lesson2207.Overriding.Animal2;
import LiubovZapsa.lesson2207.Overriding.Bird;
import LiubovZapsa.lesson2207.Overriding.Cat;
import LiubovZapsa.lesson2207.Overriding.Dog;

public class Main {
    /*
        public static void main(String[] args) {
            HashMap<String, String> countryMap = new HashMap<>();
            countryMap.put("USA", "United States of America");
            countryMap.put("UK", "United Kingdom");
            countryMap.put("CAN", "Canada");
            countryMap.put("GER", "Germany");
            countryMap.put("FRA", "France");
            for (String key : countryMap.keySet()) {
                System.out.println(key + " - " + countryMap.get(key));
    */
    public static void main(String[] args) {
        Animal2 someAnimal = new Animal2("Some animal", 1, "Grey", "sound");
        Animal2 dog = new Dog("Rex", 3, "Brown", "Gaf", "dog", 3.3);
        Animal2 bird = new Bird("Chip", 4, "green", "Chirik");
        Animal2 cat = new Cat("Pups", 2, "black", "Meau", "cat");
        someAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}










