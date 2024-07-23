package MarcencoAndrei;

public class Main {
    public static void main(String[] args) {
        Employee full = new FullTimeEmployee();
        Employee part = new PartTimeEmployee();
        full.calculateSalary();
        part.calculateSalary();
    }
}
/*
public class Main {
    public static void main(String[] args) {
        Playable Guitar = new Guitar();
        Playable Piano = new Piano();
        Playable Drums = new Drums();
        Guitar.play();
        Piano.play();
        Drums.play();
    }
}

// 1. Implement a class called “Animal” with instance variables for name, age, and sound. Create a subclass called “Dog” that inherits from “Animal”
// and includes additional instance variables such as breed and weight; create constructors to initialize all variables.
public class Animal {
    String name;
    int age;
    String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

package MarcencoAndrei;

// 1. Implement a class called “Animal” with instance variables for name, age, and sound. Create a subclass called “Dog” that inherits from “Animal”
// and includes additional instance variables such as breed and weight; create constructors to initialize all variables.
public class Dog extends Animal {
    String breed;
    double weight;

    public Dog(String name, int age, String sound, String breed, double weight) {
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Dog info = new Dog("Julienne", 7, "gav-gav", "Corgi", 17.19);
        System.out.println(info.name);
        System.out.println(info.age);
        System.out.println(info.sound);
        System.out.println(info.breed);
        System.out.println(info.weight);
    }

    public void printInfo() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


/* public class Main {


     public static void main(String[] args) {

//Create an array ArrayList of strings and add some fruits inside, print array list on screen
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("grapefruit");
        fruits.add("orange");
        fruits.add("annoying orange");
        for (String list : fruits)
            System.out.println(list); */
//  Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
       /*  HashSet<String> names = new HashSet<>();
        names.add("Dave");
        names.add("Carl");
        names.add("Spilberg");
        names.add("Seagal");
        names.add("Conrad");

        // used info from https://www.javatpoint.com/java-hashset-contains-method
        System.out.println("Size: " + names.size() + " " + names.contains("conrad")); */


      /* originally I wanted to use scanner to input a name and check if it exists inside in set, but did not understand how
        Scanner name = new Scanner();
        for (String name : names) {
            if (name.equals(names)) {
                System.out.println("Name " + names + " exists in the set");
                break;
            }
        } */


// Create a Map that stores the abbreviator as keys and names of countries as values. Add some pairs to the map and print content of map.
//  countryMap.put(“USA”, “United States of America”);

        /* String specificCountryAbbreviation = "MD";

        HashMap<String, String> countryMap = new HashMap<>();

        countryMap.put("UK", "United Kingdom");
        countryMap.put("GER", "Germany");
        countryMap.put("MD", "Moldova");
        countryMap.put("USA", "United States of America");

        System.out.println("Country name for " + specificCountryAbbreviation + " abbreviation is: " + countryMap.get(specificCountryAbbreviation)); */
